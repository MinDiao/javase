package com.hpe.day13;
/*
 * 1、	equals()方法练习s----被大多数类重写（查API看一下）
	定义两个String类型的变量，str和str1,如下
	String str = new String(“hello”);
	String str1 = “hello”;
	分别用==和equals比较这str和str1是否相等，并打印出来，并加注释说明相等和不相等的原因。
	equals()方法练习（提高）---提示：需要在Person类中复写equals()
	自定义一个Person类，有name和age属性，并建一个两个参数的构造函数，在主函数main中，定义两个Person对象p1和p2，如下，调用equals比较这个两个对象是否相等。
	Person p1 = new Person(“xiaowang”,12);
	Person p2 = new Person(“xiaowang”,12);
	p1.equals(p2);
*/
public class Equals01_Test {
	public static void main(String[] args) {
		String str = new String("hello");
		String str1 = "hello";
		if (str == str1) {//比较对象的引用地址
			System.out.println("==相等");
		} else if (str.equals(str1)) {//比较对象的属性
			System.out.println("equals()相等");
		}
		
		/*重写equals*/
		Person p1 = new Person("xiaowang",12);
		Person p2 = new Person("xiaowang",12);
		System.out.println(p1.equals(p2));
	}
}
