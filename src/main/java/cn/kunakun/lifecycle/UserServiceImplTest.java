package cn.kunakun.lifecycle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

	private ClassPathXmlApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		String xmlPath="cn/kunakun/lifecycle/applicationContext.xml";
		applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	}
	@Test
	public void testAddUser() {
		// 在目标方法前后进行的初始化或者销毁
		UserService bean = applicationContext.getBean(UserService.class);
		bean.addUser();
	}

}
