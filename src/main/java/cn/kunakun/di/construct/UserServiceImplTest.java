package cn.kunakun.di.construct;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

	private ClassPathXmlApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		String xmlPath="cn/kunakun/di/construct/applicationContext.xml";
		applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	}

	@Test
	public void testAddUser() {
		User user= applicationContext.getBean(User.class);
		System.out.println(user);
		
	}

}
