package com.hp.day06_2;

public class Student {
	//属性--成员变量
	int age;
	private String name;
	public void setAge(int age) {
		/*if (age > 20 && age < 30) {
			this.age = age;
		} else {
			System.out.println("输入不合法");
		}*/
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	//行为--成员方法
	public void sleep() {
		System.out.println("睡觉");
	}
	
	public void paly() {
		System.out.println("玩");
	}
	
	public void study() {
		System.out.println("学习");
	}
}
