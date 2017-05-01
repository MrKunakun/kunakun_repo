package cn.kunakun.di.sett;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

	private ClassPathXmlApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		String xmlPath="cn/kunakun/di/sett/applicationContext.xml";
		applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	}

	@Test
	public void testAddUser() {
		User user= applicationContext.getBean(User.class);
		SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd");
		String date = format.format(user.getCreateDate());
		System.out.println(date);
		
	}

}
