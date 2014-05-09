List falsyValues = [false, 0, 0.0, '', [], [:]]
falsyValues.each {
	Boolean truthy = it
	println truthy
}

println ''

List truthyValues = [true, 1, 1.1, 'hello', [1], [a: 1]]
truthyValues.each {
	Boolean truthy = it
	println truthy
}

