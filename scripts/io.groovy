import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
import groovy.util.slurpersupport.GPathResult
import groovy.xml.MarkupBuilder

File languages = new File('languages.csv')
println languages.text

//List lines = languages.readLines()
//println "$lines\n"

//List langs = []
//lines.each {
//	List values = it.split ','
//	langs << [lang: values[0], type: values[1], popularity: values[2]]
//}
//println langs


//StringWriter writer = new StringWriter()
//MarkupBuilder mb = new MarkupBuilder(writer)
//mb.languages  {
//	langs.each { lang ->
//		language(name: lang.lang) {
//			type lang.type
//			popularity lang.popularity
//		}
//	}
//}
//String xml = writer.toString()
//println xml
//
//GPathResult x = new XmlSlurper().parseText(xml)
//println x.language[2].@name
//println x.language[2].type
//println x.language[2].popularity




//JsonBuilder jsb = new JsonBuilder(langs)
//println "$jsb\n"
//println jsb.toPrettyString()
//
//JsonSlurper js = new JsonSlurper()
//def jso = js.parseText(jsb.toString())
//println "\n$jso"


