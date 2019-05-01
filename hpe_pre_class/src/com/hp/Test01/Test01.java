package com.hp.Test01;

public class Test01 {
	private String name;
	private int age;
	public Test01(String name, int age) {
		super();
		/*this.name = name;
		this.age = age;*/
		this.setName(name);
		this.setAge(age);
	}
	@Override
	public String toString() {
		return "Test01 [name=" + name + ", age=" + age + "]";
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
	public static void main(String[] args) {
		
	}
}
