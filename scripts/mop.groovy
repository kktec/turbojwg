import demo.JUser

x = { 'Groovy is fantastic' }
//println x.call()
//println x()

//x = { "Groovy is number $it" } // should you use 'it' or a named closure param ?
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
//
//println "owner is $c.owner"
//
//println "delegate is $c.delegate"
//
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


//String.metaClass.warning = { 'WARNING: with great power comes great responsibility' }
//x = ''.warning()





println x.class
println x

