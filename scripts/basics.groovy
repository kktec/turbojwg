def x //  what if x type is int ? is using def a good idea ?

//throw new Exception('All Exceptions are treated as unchecked in Groovy !')  // are checked Exceptions good or bad ?

//x = 13

//x = 13 + 50
//x = 13.plus(50)

//x = 13.5

//x = 13.55555.setScale(4, java.math.RoundingMode.HALF_UP)
//assert x == 13.5555
//assert 13.5 == 13.50000 // is this true in Java ? i.e. assertEquals(new BigDecimal("13.5").equals(new BigDecimal("13.50000"));
//assert 13.5 + 2.84 == 16.34
//assert 13.5 + 2.84D == 16.34

//x = 13.5 <=> 13.6
//x = 13.5 <=> 13.5
//x = 13.5 <=> 13.4

//class Person {
//	String name
//	
//	boolean equals(Object other) { name == other.name }
//	int hashcode() { name.hashcode() }
//	String toString() { name }
//}
//
//x = new Person(name: 'ken')
//y = new Person(name: 'ken')
//
//x = new Person()
//println 'name is ' + x.name?.toUpperCase()
//println x == y
//println x.is(y)

//x = 13.9D

//x = 'hello'[1]
//x = 'hello'.substring(0, 4)
//x = 'hello'[0..3]
//x = 'hello'[-1]
//x = 'hello'[-1..0]
//x = 'hello'.reverse()
//x = 'hello'.capitalize()
//x = 'hello'.center(13)
//x = 'hello'.padRight(13, '_')
//x = '123' as Integer
//x = '456'.toInteger()

//x = /\d{3}/
//assert '1A3' =~ x
//assert '123A' =~ x
//assert '123A' ==~ x

//x = '''
//hello
//'''

String city = 'MSN'

//x = "hello $city"

//x = "hello ${city.toUpperCase()}"

//x = """
//hello
//$city
//"""

//x = []
//x = [] as Object[]
//x = [] as LinkedList
//x = [] as Set
//x = [:]
//x = [:] as java.util.concurrent.ConcurrentHashMap
//println x.size()

//x = '456'.toList()
//x = x.join(',')
//x = x.split(',')

//x = new Date().clearTime() + 7

//class Duck {
//	String quack() { 'quack' }
//}
//x = new Duck().quack()
//
//class BadDoctor {
//	String quack() { 'take these pills and you will be cured' }
//}
//x = new BadDoctor().quack()

//x = {}
//println x.call()

//x = { 'Groovy is fantastic' }
//println x.call()

//x = { "Groovy is number $it" } // should you use 'it' or named closure params ?
//println x.call(1)

//x = { comment -> 
//	"Groovy is $comment"
//}
//println x.call('really useful')

//x = new Runnable() {
//	void run() {
//		println 'Groovy is great'
//	}
//}
//x.run()

//x = { println 'Groovy is my favorite' } as Runnable
//x.run()

//String.metaClass.toUpperCase = { 'WARNING: with great power comes great responsibility' }
//x = 'xx YY'.toUpperCase()



//Closure c = { "$delegate cannot wait to start using Groovy" }
//String.metaClass.groovy = c
//println city.groovy()

//println ''
//println "owner is $c.owner"
//println "delegate is $c.delegate"
//println "resolveStrategy is $c.resolveStrategy"
//println ''
//println Closure.OWNER_FIRST
//println Closure.DELEGATE_FIRST
//println Closure.OWNER_ONLY
//println Closure.DELEGATE_ONLY
//println Closure.TO_SELF
//println ''



println x.getClass().getName()
println x





