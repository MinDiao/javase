package com.hpe.day10;

public class Dog extends Animal {
	//重写eat方法
	public void eat() {
		System.out.println("吃骨头");
	}
	//创建公有方法：看门
	public void kanJia() {
		System.out.println("看家");
	}
}
