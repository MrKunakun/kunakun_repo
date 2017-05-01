package cn.kunakun.scope;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

	private ClassPathXmlApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		String xmlPath="cn/kunakun/scope/applicationContext.xml";
		applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	}

	@Test
	public void testAddUser() {
		UserService userService = applicationContext.getBean(UserService.class);
		UserService userService2 = applicationContext.getBean(UserService.class);
		System.out.println(userService==userService2?"相同":"不相同");
	}

}
