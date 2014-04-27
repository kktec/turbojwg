def x = 0

if (!x) {
	println 'no x'
} else {
	print 'got x'
}

//println x ? 'x' : 'y'

//println x ?: 'y'

//x = 'xx YY'
//println x.toUpperCase() // what if x == 1

//for (int i = x; i < 5; ++i) {
//	println i
//}

//while (x < 5) {
//	println x++
//}

//do { // unsupported
//	
//} while (x < 5)

//5.times { println it }

//(0..<5).each { println it }

//for (i in 0..4) { println i }

//x = [1, 2, 3, 4]
//for(Integer i : x) { println i }
//x.each { println it }

//x.upto(5) { println it }
//x.downto(-1) { println it }

//import java.sql.Date as DbDate
//class Xyz {}
//stuff = ['x', 3, new Date(), 'y', 25, { 'i need closure' }, new Xyz(), new DbDate(51, 5, 8)]
//stuff.each {
//	switch(it) {
//		case Integer: println "int $it"; break
//		case Date: println "date is $it"; break
//		case Closure: println it.call(); break
//		default: println it
//	} // isCase()
//}

	