package demo

import spock.lang.Specification

class UserControllerSpec extends Specification {
	
	UserRepository userRepository = Mock()
	
//	JUserController controller = new JUserController(userRepository: userRepository)
	GUserController controller = new GUserController(userRepository: userRepository)
	
	Map params = [username: 'ken']
	
	Map errors = [:]
	
	Map modelAndView = [:]
	
	def 'can add a new user'() {
		when:
		Map modelAndView = controller.addUser params
		
		then:
		1 * userRepository.saveUser(_ as JUser) >> errors
		0 * _
		with(modelAndView) {
			user
			!errors
			view == 'showUser'
		}
	}

	def 'can NOT add a new user with errors'() {
		given:
		errors.username = 'required'
		
		when:
		Map modelAndView = controller.addUser params
		
		then:
		1 * userRepository.saveUser(_ as JUser) >> errors
		0 * _
		with(modelAndView) {
			user
			errors == [username: 'required']
			view == 'addUser'
		}
	}
	
	def 'can NOT add a user with null params'() {
		when:
		controller.addUser null
		
		then:
		IllegalArgumentException x = thrown()
		x.message == 'Params required'
	}
	
	def 'can NOT add a user with no params'() {
		when:
		controller.addUser [:]
		
		then:
		IllegalArgumentException x = thrown()
		x.message == 'Params required'
	}
}
