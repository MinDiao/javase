package com.hp.day06_3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//测试二，使用有参的构造方法给成员变量赋值
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数");
		int num2 = sc.nextInt();
		//实例化对象		
		Rectangle r = new Rectangle(num1,num2);
		System.out.println(r.perimeter());
		System.out.println(r.area());
	}

}
