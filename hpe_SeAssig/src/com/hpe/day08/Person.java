package com.hpe.day08;

public class Person {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public Person() {
		
	}
	public Person(String name) {
		this.setName(name);
	}
}
