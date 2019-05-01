package com.hpe.day12;

public class Nan extends Fu implements Smoke, Drink {
	
	public Nan(int age) {
		super(age);
	}
	/*重写父类方法*/
	public void sleep() {
		System.out.println("Nan,"+ age +"岁在睡觉");
	}
	
	/*实现接口的方法*/
	public void smokee() {
		System.out.println("Nan,"+ age +"岁在吸烟");
	}
	
	public void drink() {
		System.out.println("Nan,"+ age +"岁在喝水");
	}
	
}
