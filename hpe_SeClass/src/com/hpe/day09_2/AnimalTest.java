package com.hpe.day09_2;

public class AnimalTest {
	// 编写方法：让小动物去吃东西，该动物如果是Cat，就去抓老鼠；如果是Dog，就去看门
	public static void main(String[] args) {
		Animal c = new Cat();
		Animal d = new Dog();
		fn(c);
		fn(d);
	}
	public static void fn(Animal a) {
		a.eat();
		if (a instanceof Cat) {
			Cat c = (Cat)a;
			c.catchM();
		}
		if (a instanceof Dog) {
			Dog d = (Dog)a;
			d.door();
		}
	}
}