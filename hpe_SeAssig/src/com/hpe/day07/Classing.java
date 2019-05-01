package com.hpe.day07;

public class Classing {
	//属性
	private String name;
	private int age;
	public Classing(String name, int age) {
		super();
		/*this.name = name;
		this.age = age;*/
		setName(name);//想比上面有安全判断条件
		setAge(age);
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
		//判断条件
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("年龄不能小于0");
		}
	}
}
