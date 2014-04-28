import groovy.transform.ToString

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

@ToString
class TimeRecord {
	Integer id
	String code
	String type
	Integer project
	BigDecimal hours
}


//List ot = timeRecords.findAll { it.type == 'OT' }              // FILTER
//List otRecords = ot.collect { new TimeRecord(it) }             // MAP
//BigDecimal otHours = otRecords.inject(0.0) { total, value ->   // REDUCE
//	total += value.hours
//}
//println ot
//println otRecords
//println otHours
//println ot.sum { it.hours }

//List codes = timeRecords.collect { it.code }
//println codes
//println timeRecords*.code

//Set uniqueCodes = timeRecords*.code
//println "\n$uniqueCodes\n"
//uniqueCodes.asImmutable() << 'whatever'


//Map hoursByProject = timeRecords.groupBy(
//	{  it.project }, // can add more Closures for sub-groups
//).findAll { it.key != null }
//.collectEntries { k, v ->
//	[k, v.hours.sum()]
//}.sort { it.key }
//hoursByProject.each { println "Project $it.key Hours = $it.value"}



//List numbers = [1, 2, 3, 4, 5]
//println numbers.collate(2)
//Set permutations = numbers.permutations()
//println permutations
//println permutations.size()
//println numbers.last()
//println numbers.tail()
//println numbers.take(3)



//println ''
//List stack = []
//stack.push 1
//println stack
//stack.push 2
//println stack
//stack.push 'plus'
//println stack
//
//String operation = stack.pop()
//println stack
//Integer operand2 = stack.pop()
//println stack
//Integer operand1 = stack.pop()
//println stack
//println operand1.invokeMethod(operation, [operand2])



