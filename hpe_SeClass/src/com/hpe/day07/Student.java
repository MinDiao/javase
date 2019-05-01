package com.hpe.day07;

public class Student extends People {
	//构造方法
	/*public Student() {
		System.out.println("子类构造方法");
	}*/
	public Student() {
		super("小明","男");
		System.out.println("ok2");
	}
	//属性
	String sNo;//学号
	//方法
	public void study() {
		System.out.println("学习");
		System.out.println(super.name);
	}
	public void show() {
		System.out.println();
		super.show();
	}
}
