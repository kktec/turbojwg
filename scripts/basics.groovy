import demo.JUser

def x = this // is using def a good idea ? what if x type is defined as int ?

//throw new Exception('All Exceptions are treated as unchecked in Groovy !') 
// are checked Exceptions a good idea ?

//x = 13
//x = 13.5
//x = 13.9D


//x = 13.55555.setScale(4, java.math.RoundingMode.HALF_UP)
//assert x == 13.5556
//println x.is(13.5556)

//x = new JUser(username: 'ken')
//println x.dump()
//x = new JUser()
//println 'username is ' + x.username?.toUpperCase()


//x = '123' as Integer

//x = 'xyz'
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

String city = 'MSN'
//println city.size()
//x = "hello $city"

//x = "hello ${city.toLowerCase()}"

//x = '''
//hello
//
//world
//'''

//x = """
//hello
//$city
//"""

//x = /\d{3}/
////assert '1A3' =~ x
//assert '123A' =~ x


//x = []
//x = [1, 2, 3]
//println x.size()
//x = [1, 2, 3] as Object[]
//x = [] as LinkedList
//x = [] as Set

//x = [:]
//x = [name: 'kkktec', favoriteLanguage: 'Groovy']
//x = [] as java.util.concurrent.ConcurrentHashMap


//x = {}
//println x()

//x = { 'Groovy is fantastic' }
//println x()


//x = { "Groovy is number $it" } // should you use 'it' or named closure params ?
//println x(1)

//x = { comment -> 
//	"Groovy is $comment"
//}
//println x('really powerful')

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
//c()

//println "owner is $c.owner"

//println "delegate is $c.delegate"

//c = { println username }
//user = new JUser(username: 'ken')
//c.delegate = user
//println "delegate is $c.delegate"
//c()


//println "resolveStrategy is $c.resolveStrategy"
//println ''
//println Closure.OWNER_FIRST
//println Closure.DELEGATE_FIRST
//println Closure.OWNER_ONLY
//println Closure.DELEGATE_ONLY

//x = [name: 'me', warning: { 'oh oh' }]
//println x.warning()


//String.metaClass.warning = { 'WARNING: with great power comes great responsibility' }
//x = ''.warning()




println x.getClass().getName()
println x





