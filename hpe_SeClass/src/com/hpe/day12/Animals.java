package com.hpe.day12;
/*
 * 	按照以下内容，提取抽象类，并实现猫狗类：
	具体事物：猫，狗 
	共性：姓名，年龄，吃饭 
 */
public abstract class Animals {
	String name;
	int age;
	
	public Animals(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void eating();
}
