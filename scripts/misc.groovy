import groovy.swing.SwingBuilder

import javax.swing.JFrame
import javax.swing.WindowConstants

// Execute a process - check Java and Groovy documentation
//Process p = 'git status'.execute()
//println p.text



// Execute a script stored in a database or created on the fly
//String script = '''
//numbers.each {
//	println function.call(it)
//}
//'''
//
//Binding binding = new Binding(numbers: [1, 2, 3], function: { it ** 2 })
//new GroovyShell(binding).evaluate script


//SwingBuilder swing = new SwingBuilder()
//def frame = swing.frame(
//	title: 'Hello World',
//	defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE,
//	location: [400, 500],
//	preferredSize: [300, 50],
//	pack: true) {
//		panel() {
//			label('from Groovy')
//		}
//}
//frame.visible = true

// for better desktop apps see the Griffon project: JavaFx, Swing, and more toolkits
