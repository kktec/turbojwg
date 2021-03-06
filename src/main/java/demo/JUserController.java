package demo;

import java.util.HashMap;
import java.util.Map;

public class JUserController {
	
	private UserRepository userRepository;
	
	Map<String, Object> addUser(Map<String, String> params) {
		if (params == null || params.size() == 0) {
			throw new IllegalArgumentException("Params required");
		}
		
		JUser user = new JUser();
		user.setUsername(params.get("username"));
		user.setFirstName(params.get("firstName"));
		user.setLastName(params.get("lastName"));
		user.setEmail(params.get("email"));
		System.out.println(user);
		
		Map<String, String> errors = userRepository.saveUser(user);
		
		Map<String, Object> modelAndView = new HashMap<String, Object>();
		modelAndView.put("user", user);
		modelAndView.put("errors", errors);
		modelAndView.put("view", errors.size() > 0 ? "addUser" : "showUser");
		
		return modelAndView;
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
