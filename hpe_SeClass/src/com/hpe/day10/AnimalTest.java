package com.hpe.day10;

public class AnimalTest {
	//创建吃功能的方法并向下转型
	public static void function(Animal a) {
		a.eat();
		//向下转型
		if (a instanceof Cat) {
			Cat c = (Cat)a;
			c.catchMouse();
		}
		if (a instanceof Dog) {
			Dog d = (Dog)a;
			d.kanJia();
		}
	}
	public static void main(String[] args) {
		Animal c = new Cat();
		Animal d = new Dog();
		function(c);
		function(d);
	}
}
