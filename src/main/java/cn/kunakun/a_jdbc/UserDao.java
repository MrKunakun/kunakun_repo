package cn.kunakun.a_jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDao  extends JdbcDaoSupport{

	public void addUser(User user) {
		String sql="INSERT INTO t_user (userName, PASSWORD) VALUES(?,?)";
		this.getJdbcTemplate().update(sql, user.getUserName(),user.getPassword());
		
	}
//	查询所有
	public List<User> queryAll() {
		List<User> list = this.getJdbcTemplate().query("select * from t_user",
				ParameterizedBeanPropertyRowMapper.newInstance(User.class));
		return list;
	}

}
