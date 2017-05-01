package cn.kunakun.a_jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class TestApi {

	private ApplicationContext applicationContext;

	@Before
	public void setUp() {
		String configLocation = "cn/kunakun/a_jdbc/applicationContext.xml";
		applicationContext = new ClassPathXmlApplicationContext(
				configLocation);
	}

	@Test
	public void Test01() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/db_test");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		String sql = "INSERT INTO t_user (userName, PASSWORD) VALUES(?,?)";
		jdbcTemplate.update(sql, "武当张三丰", "000000");

	}
	@Test
	public void Test02() {
		UserDao userDao = applicationContext.getBean(UserDao.class);
		User user =new User();
		user.setUserName("峨眉派灭绝师太");
		user.setPassword("倚天剑");
		userDao.addUser(user );
		
	}
	
	@Test
	public void Test03() {
		UserDao userDao = applicationContext.getBean(UserDao.class);
	    List<User> list=	userDao.queryAll();
	    for (User user : list) {
			System.out.println(user);
		}
	}
	

}
