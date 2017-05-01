package cn.kunakun.ioc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

	private ClassPathXmlApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		String xmlPath="spring/applicationContext.xml";
		applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	}

	@Test
	public void testAddUser() {
		UserService userService = applicationContext.getBean(UserService.class);
		userService.addUser();
	}

}
