import groovy.transform.Immutable

List timeRecords = [
	[id: 12, code: 'project', type: 'ST', project: 1, hours: 25.1],
	[id: 12, code: 'admin', type: 'ST', project: null, hours: 3.3],
	[id: 12, code: 'project', type: 'ST', project: 2, hours: 12.6],
	[id: 12, code: 'project', type: 'OT', project: 1, hours: 5.1],
	
	[id: 23, code: 'project', type: 'ST', project: 2, hours: 30.2],
	[id: 23, code: 'admin', type: 'ST', project: null, hours: 1.1],
	[id: 23, code: 'project', type: 'ST', project: 2, hours: 12.6],
	
	[id: 44, code: 'project', type: 'ST', project: 2, hours: 30.4],
	[id: 44, code: 'admin', type: 'ST', project: null, hours: 1.6],
	[id: 44, code: 'sick', type: 'ST', project: null, hours: 8.0],
	
	[id: 66, code: 'project', type: 'ST', project: 1, hours: 31.2],
	[id: 66, code: 'admin', type: 'ST', project: null, hours: 1.1],
	[id: 66, code: 'project', type: 'ST', project: 3, hours: 6.2],
	[id: 66, code: 'project', type: 'OT', project: 1, hours: 8.0],
]

@Immutable
class TimeRecord {
	Integer id
	String code
	String type
	Integer project
	BigDecimal hours
}


//List ot = timeRecords.findAll { it.type == 'OT' }              // FILTER
//println ot

//List otRecords = ot.collect { new TimeRecord(it) }             // MAP
//println otRecords

//BigDecimal otHours = otRecords.inject(0.0) { total, value ->   // REDUCE
//	total += value.hours
//}
//println otHours

//println ot.sum { it.hours } ?: 0.0



//Set uniqueCodes = timeRecords.collect { it.code }
//Set uniqueCodes = timeRecords*.code
//println "\n$uniqueCodes\n"
//uniqueCodes.asImmutable() << 'whatever'



//List numbers = [1, 2, 3, 4, 5]
//println numbers.collate(2)
//Set permutations = numbers.permutations()
//println permutations
//println permutations.size()
//println numbers.last()
//println numbers.tail()
//println numbers.take(3)



//numbers.push 13
//println numbers
//println numbers.pop()
//println numbers
