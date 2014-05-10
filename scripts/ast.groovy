// AST (Abstract Syntax Tree) Transformation - Compile-Time Metaprogramming
// Writing AST's is hard !!! - but an ASTBrowser is availble - good chapter on this in GIA 2nd ed.


import demo.Address

Date today = new Date()

Address a = new Address('123 Easy St.', '#1', 'MSN', 'WI', '53704', today)
println a
//a.city = 'MKE' // Immutable !
//assert a.asOf.is(today)



// we want the primaryAddress values exposed on the Person class
// we want to use composition, not inheritance
class Entity {}
class Person extends Entity {
	String name

	@Delegate 
	Address primaryAddress // first @Delegate declared wins
}

//Person p = new Person(name: 'ken', primaryAddress: a)
//println "$p.name's city is $p.city"



//@groovy.transform.ToString
//@groovy.transform.TupleConstructor
//@groovy.transform.EqualsAndHashCode
//@groovy.transform.Canonical
//class Distance {
//	enum Unit { METERS, YARDS }
//	
//	Unit unit
//	Double value
//}
//
//Distance m1 = new Distance(unit: Distance.Unit.METERS, value: 400)
//println m1

//Distance m2 = new Distance(Distance.Unit.METERS, 400)
//println m2

//assert m1 == m2
//println m1.hashCode()



/*
 * Lots of useful ASTs available - including, but not limited to :
 * 
 * AnnotationCollector - an be used to define aliases for groups of annotations
 * AutoClone - used to assist in the creation of Cloneable classes
 * Bindable - indicates that the property should be a bound property according to the JavaBeans spec
 * CompileStatic - let the Groovy compiler type checking and perform static compilation, bypassing Groovy meta object protocol
 * Grab - grab the referenced artifact and its dependencies and make it available on the Classpath (sef-contained scripts)
 * InheritConstructors - make constructors from a super class available in a sub class
 * Lazy - Field annotation to simplify lazy initialization
 * ListenerList - adds Java-style listener support to a class based on an annotated Collection-property
 * Commons, Log, Log4j, Log4j2, Slf4j injects a 'log' field into the class
 * Memoized - creates a cache for the results of the execution of the annotated method
 * Synchronized - safer variant of the synchronized method modifier - different locks
 * TypeChecked - use compile time checks in the style of Java
 * 
 */




