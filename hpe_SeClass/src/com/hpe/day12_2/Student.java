package com.hpe.day12_2;

public class Student implements Person {

	@Override
	public void eat() {
		System.out.println("在食堂吃饭");
	}

	@Override
	public void sleep() {
		System.out.println("在宿舍住宿");
	}

}
