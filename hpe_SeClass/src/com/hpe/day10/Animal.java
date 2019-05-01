package com.hpe.day10;
/*
 * 	父类Animal,包含eat()方法
	子类Cat,重写eat(),吃鱼；公有方法catchMouse()，抓老鼠。
	子类Dog,重写eat(),吃骨头；公有方法kanJia(),看家。
	测试类，创建两个Animal对象，一个cat,一个dog；
	设计一个function(Animal a)方法，实现吃的功能，如果为cat,
	则再让它抓老鼠，如果为dog，则再让它看家。主函数中分别调用function方法。
 */
public class Animal {
	public void eat() {
		System.out.println("吃饭");
	}
}
