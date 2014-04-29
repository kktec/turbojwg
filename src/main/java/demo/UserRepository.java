package demo;

import java.util.Map;

 interface UserRepository {

	/**
	 * @param user
	 * 
	 * @return Map of errors by property, empty if none
	 */
	Map<String, String> saveUser(Object user);

}
