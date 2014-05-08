import demo.GUser
import demo.JUser

//throw new Exception('All Exceptions are treated as unchecked in Groovy !') 
// are checked Exceptions a good idea ?

def x = this // is using def a good idea ? what if x type is defined as int ?

//x = 13
//x = 13.5
//x = 13.9D


//x = 13.55555.setScale(4, java.math.RoundingMode.HALF_UP)
//assert x == 13.5555
//println x.is(13.5556)
//assert 13.5 == 13.50000 // is this true in Java ?

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
//x = new Person()
//println 'name is ' + x.name?.toUpperCase()


//x = '123' as Integer

//x = ''
//x = 'hello'[1]
//x = 'hello'.substring(0, 4)
//x = 'hello'[0..3]
//x = 'hello'[-1]
//x = 'hello'[-1..0]
//
//x = 'hello'.reverse()
//x = 'hello'.capitalize()
//x = 'hello'.center(13)
//x = 'hello'.padRight(13, '_')
//
//String city = 'MSN'
//println city.size()
//x = "hello $city"
//
//x = "hello ${city.toLowerCase()}"
//
//x = '''
//hello
//'''
//
//x = """
//hello
//$city
//"""
//
//x = /\d{3}/
//assert '1A3' =~ x
//assert '123A' =~ x


//x = []
//x = [1, 2, 3]
//println x.size()
//x = [1, 2, 3] as Object]
//println x.size()
//x = [] as LinkedList
//x = [] as Set

//x = [:]
//x = [name: 'kkktec', favoriteLanguage: 'Groovy']
//x = [:] as java.util.concurrent.ConcurrentHashMap
//println x.size()
//
//x = '456'.toList()
//x = x.join(',')
//x = x.split(',')




//x = {}
//println x.call()
//
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
//def c = { println "x is $x" }`
//c.call()
//
//println "owner is $c.owner"
//println "delegate is $c.delegate"
//println "resolveStrategy is $c.resolveStrategy"
//println ''
//println Closure.OWNER_FIRST
//println Closure.DELEGATE_FIRST
//println Closure.OWNER_ONLY
//println Closure.DELEGATE_ONLY
//println Closure.TO_SELF




//String.metaClass.warning = { 'WARNING: with great power comes great responsibility' }
//x = ''.warning()




println x.getClass().getName()
println x





