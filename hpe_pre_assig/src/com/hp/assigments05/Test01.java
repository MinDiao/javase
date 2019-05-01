package com.hp.assigments05;

public class Test01 {
	private String name;
	private int age;
	public Test01(String name, int age) {
		super();
		this.name = name;
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
