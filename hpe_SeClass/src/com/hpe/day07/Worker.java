package com.hpe.day07;

public class Worker extends People {
	public Worker(String name, String sex) {
		super(name, sex);
		// TODO Auto-generated constructor stub
	}
	//属性
	String wNo;//工牌号
	//方法
	public void work() {
		System.out.println("干活");
	}
}
