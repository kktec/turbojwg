package demo;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class JUserControllerTests {
	
	UserRepository userRepository;
	
	JUserController controller = new JUserController();
//	GUserController controller = new GUserController();
	
	Map<String, String> params = new HashMap<String, String>();
	
	Map<String, String> errors = new HashMap<String, String>();
	
	Map<String, Object> modelAndView = new HashMap<String, Object>();
	
	@Before
	public void setUp() {
		userRepository = EasyMock.createStrictMock(UserRepository.class);
		controller.setUserRepository(userRepository);
		params.put("username", "ken");
	}

	@Test
	public void can_add_a_new_user() {
		EasyMock.expect(userRepository.saveUser(EasyMock.isA(JUser.class))).andReturn(errors).once();
		EasyMock.replay(userRepository);
		
		Map<String, Object> modelAndView = controller.addUser(params);
		
		EasyMock.verify(userRepository);
		assertNotNull(modelAndView.get("user"));
		assertEquals("showUser", modelAndView.get("view"));
		assertEquals(errors, modelAndView.get("errors"));
	}

	@Test
	public void can_NOT_add_a_new_user_with_errors() {
		errors.put("username", "required");
		EasyMock.expect(userRepository.saveUser(EasyMock.isA(JUser.class))).andReturn(errors).once();
		EasyMock.replay(userRepository);
		
		Map<String, Object> modelAndView = controller.addUser(params);
		
		EasyMock.verify(userRepository);
		assertNotNull(modelAndView.get("user"));
		assertEquals("addUser", modelAndView.get("view"));
		assertEquals(errors, modelAndView.get("errors"));
	}
	
	@Test
	public void can_NOT_add_a_user_with_null_params() {
		try {
			controller.addUser(null);
			fail("expected IllegalArgumentException");
		} catch(IllegalArgumentException x) {
			assertEquals("Params required", x.getMessage());
		}
	}

	@Test
	public void can_NOT_add_a_user_with_no_params() {
		try {
			controller.addUser(new HashMap<String, String>());
			fail("expected IllegalArgumentException");
		} catch(IllegalArgumentException x) {
			assertEquals("Params required", x.getMessage());
		}
	}

}
