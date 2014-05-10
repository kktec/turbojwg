package demo

class GUserController {
	
	UserRepository userRepository
	
	Map addUser(params) {
		if (!params) { throw new IllegalArgumentException('Params required') }
		
		JUser user = new JUser(
			username: params.username,
			firstName: params.firstName,
			lastName: params.lastName,
			email: params.email
		)
		println user.dump()

		Map errors = userRepository.saveUser user
		
		[user: user, errors: errors, view: (errors ? 'addUser' : 'showUser')]
	}

}
