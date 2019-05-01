package com.hp.Test01;

public class UserDemo {
	public static void main(String[] args) {
		User u = new User();
		u.name = "张三";
		u.age = 12;
		u.run();
		u.stop();
		
		UserTest ut = new UserTest();
		ut.method(u);
	}
}
