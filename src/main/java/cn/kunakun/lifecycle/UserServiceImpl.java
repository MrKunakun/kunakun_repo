package cn.kunakun.lifecycle;

public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
		System.out.println("被new了");
	}
	@Override
	public void addUser() {
		System.out.println("addUser");
	}
	public void myInit(){
		System.out.println("cn.kunakun.lifecycle.UserServiceImpl.myInit() ");
	}
	public void myDestory (){
		System.out.println("cn.kunakun.lifecycle.UserServiceImpl.myDestory()");
	}
}
