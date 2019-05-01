package com.hpe.day07;
/*
 * 	定义一个员工类,自己分析出几个成员，getXxx()/setXxx()方法，以及一个显示所有成员信息的方法。并测试
 */
public class Person {
	private String name;
	private int age;
	private String sex;
	public Person(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	
	
	//打印
	public void show() {
		System.out.print(this.getName()+"\t");
		System.out.print(this.getAge()+"\t");
		System.out.print(this.getSex()+"\t");
	}
}
