package cn.kunakun.di.sett;

public class UserServiceImpl implements UserService{

	private UserDao UserDao;
	
	public void setUserDao(UserDao userDao) {
		UserDao = userDao;
	}
	@Override
	public void addUser() {
		UserDao.addUser();
	}
}
