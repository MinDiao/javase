package com.hpe.day10;

public class Cat extends Animal {
	//重写eat方法
	public void eat() {
		System.out.println("吃鱼");
	}
	//创建公有方法：抓老鼠
	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}
