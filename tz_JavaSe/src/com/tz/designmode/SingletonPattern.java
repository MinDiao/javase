package com.tz.designmode;
/*
 * 	设计模式: 单例模式
 */
class Single {
//	2.直接在本类中new一个本类对象
	
//	饿汉式:实际开发用的多
//	private static /*final*/ Single s = new Single();
	
//	懒汉式:面试多
	private static /*final*/ Single s = null;
	
//	1.私有化构造函数
	private Single() {
		System.out.println(123);
	}
	
//	3.定义一个功能,其它程序可以通过这个功能获取到本类的对象
	public static Single getInstance() {
		if (s == null) {
			s = new Single();
		}
		return s;
	}
}

public class SingletonPattern {
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
	}
}
