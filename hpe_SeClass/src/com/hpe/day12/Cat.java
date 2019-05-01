package com.hpe.day12;

public class Cat extends Animals {
	public Cat(String name, int age) {
		super(name, age);
	}
	public void eating() {
		System.out.println("姓名："+name+"，年龄："+age+"猫吃饭");
	}
}
