package com.hpe.day12_2;

public class Teacher implements Person {

	@Override
	public void eat() {
		System.out.println("在教师食堂吃饭");
	}

	@Override
	public void sleep() {
		System.out.println("在学校公寓住宿");
	}

}
