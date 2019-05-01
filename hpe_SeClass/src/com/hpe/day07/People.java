package com.hpe.day07;

public class People {
	/*public People() {
		System.out.println("父类构造方法");
	}*/
	public People(String name, String sex) {
		this.name = name;
		this.sex = name;
		System.out.println("ok");
	}
	//属性
	String name;
	String sex;
	//方法
	public void sleep() {
		System.out.println("睡觉");
	}
	public void eat() {
		System.out.println("吃饭");
	}
	public void show() {
		System.out.println();
	}
}
