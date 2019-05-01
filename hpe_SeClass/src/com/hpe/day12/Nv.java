package com.hpe.day12;

public class Nv extends Fu implements Smoke, Drink {
	
	public Nv(int age) {
		super(age);
	}
	/*重写父类方法*/
	public void sleep() {
		System.out.println("Nv,"+ age +"岁在睡觉");
	}
	
	/*实现接口的方法*/
	public void smokee() {
		System.out.println("Nv,"+ age +"岁在吸烟");
	}
	
	public void drink() {
		System.out.println("Nv,"+ age +"岁在喝水");
	}
	
}
