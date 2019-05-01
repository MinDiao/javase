package com.hp.assigments05;

public class Person {
	private int number;
	private String name;
	private int age;
	public Person(int number,String name,int age) {
		this.number = number;
		this.name = name;
		this.age = age;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
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
	public void cell() {
		System.out.println("编号:"+number+",姓名:"+name+",年龄:"+age);
	}
}
