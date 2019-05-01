package com.hpe.day12;

public class Dog extends Animals {
	public Dog(String name, int age) {
		super(name, age);
	}
	@Override
	public void eating() {
		System.out.println("姓名："+name+"，年龄："+age+"狗吃饭");
	}
}
