package cn.kunakun.api;

public class UserServiceImpl implements UserService{

	private UserDao UserDao;
	
	
	public void setUserDao(UserDao userDao) {
		UserDao = userDao;
	}
	@Override
	public void addUser() {
		UserDao.addUser();
	}
	public UserServiceImpl() {
		System.out.println("cn.kunakun.api.UserServiceImpl 被new了！ ");
	}
	
}
