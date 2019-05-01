package com.hpe.day06;
/*
 * 题目：有5个人坐在一起，问第五个人多少岁？
 * 他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。
 * 问第三个人，又说比第2人大两岁。
 * 问第2个人，说比第一个人大两岁。
 * 最后问第一个人，他说是10岁。请问第五个人多大？
 * 
 */
public class Ages {
	public static void main(String[] args) {
		System.out.println(run1());
		System.out.println(run2(5));
	}
	//方法一：for循环
	public static int run1() {
		int num1 = 10, num5 = 0;
		for (int i = 0; i < 4; i++) {
			num1 += 2;
			num5 = num1;
		}
		return num5;
	}
	
	//方法二：递归
	public static int run2(int num) {
		if (num == 1) {
			return 10;
		}
		return run2(num - 1) + 2;
	}
	
}
