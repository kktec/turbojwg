File languages = new File('languages.csv')
println languages.text


List lines = languages.readLines()
println "$lines\n"

List langs = []
lines.each {
	List values = it.split ','
	langs << [lang: values[0], type: values[1], popularity: values[2]]
}
println langs

println '\nJVM LANGUAGES:'
langs.each {
	println "$it"
}