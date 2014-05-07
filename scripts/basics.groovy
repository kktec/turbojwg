import demo.GUser
import demo.JUser

//println this

//throw new Exception('All Exceptions are treated as unchecked in Groovy !') 
// are checked Exceptions a good idea ?

def x // is using def a good idea ?

//x = 13 // what if x type is defined as int ?

//x = 13 + 50
//x = 13.5
//x = 13.9D


//x = 13.55555.setScale(4, java.math.RoundingMode.HALF_UP)
//assert x == 13.5555
//println x <=> 13.555
//println x.is(13.5556)

//x = 13.plus(50.0)

//assert 13.5 == 13.50000 // is this true in Java ? 
//assert 13.5 + 2.84 == 16.34
//assert 13.5 + 2.84D == 16.34

//class Person {
//	String name
//	
//	boolean equals(other) { name == other.name }
//	int hashcode() { name.hashcode() }
//	String toString() { name }
//}
//
//x = new Person(name: 'ken')
//println x.dump()
//y = new Person(name: 'ken')
//
//x = new Person()
//println x == y
//println x.is(y)
//println 'name is ' + x.name?.toUpperCase()


//x = '123' as Integer
//x = '456'.toInteger()

//int y = '789'
//x = y
//println y

//x = new GUser(username: 'kktec')
//x = new JUser(username: 'ken')


//x = 'hello'[1]
//x = 'hello'.substring(0, 4)
//x = 'hello'[-1]
//x = 'hello'[0..3]
//x = 'hello'[-1..0]

//x = 'hello'.reverse()
//x = 'hello'.capitalize()
//x = 'hello'.center(13)
//x = 'hello'.padRight(13, '_')

String city = 'MSN'
//println city.size()
//x = "hello $city"

//x = "hello ${city.toUpperCase()}"

//x = '''
//hello
//'''

//x = """
//hello
//$city
//"""

//x = /\d{3}/
//assert '1A3' =~ x
//assert '123A' =~ x
//assert '12' ==~ x
//assert '123' ==~ x


//x = []
//x = [1, 2, 3,] // note the extra comma !
//println x.size()
//x = [] as Object[]
//x = [] as LinkedList
//x = [] as Set
//x = [:]
//x = [name: 'kkktec', favoriteLanguage: 'Groovy']
//x = [:] as java.util.concurrent.ConcurrentHashMap
//println x.size()

//x = '456'.toList()
//x = x.join(',')
//x = x.split(',')



//class Duck {
//	String quack() { 'quack' }
//}
//def quacker = new Duck()
//x = quacker.quack()
//
//
//class BadDoctor {
//	String quack() { 'take these pills and you will lose weight AND be cured of all your illnesses' }
//}
//quacker = new BadDoctor()
//x = quacker.quack()


//x = 1 <=> 2


//x = {}
//println x.call()

//x = { 'Groovy is fantastic' }
//println x.call()

//x = [a: '1', b: '2']
//x.with {
//	assert a == '1'
//	assert b == '3'
//}

//x = { "Groovy is number $it" } // should you use 'it' or named closure params ?
//println x.call(1)

//x = { comment -> 
//	"Groovy is $comment"
//}
//println x.call('really powerful')

//x = new Runnable() {
//	void run() {
//		println 'Groovy is great'
//	}
//}
//x.run()

//x = { println 'Groovy is my favorite' } as Runnable
//x.run()

//x = 7
//def c = { println "x is $x" }
//c.call()

//println "owner is $c.owner"
//println "delegate is $c.delegate"
//println "resolveStrategy is $c.resolveStrategy"
//println ''
//println Closure.OWNER_FIRST
//println Closure.DELEGATE_FIRST
//println Closure.OWNER_ONLY
//println Closure.DELEGATE_ONLY
//println Closure.TO_SELF




String.metaClass.warning = { 'WARNING: with great power comes great responsibility' }
x = ''.warning()




println x.getClass().getName()
println x





