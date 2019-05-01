package com.hpe.day05;

import java.util.Scanner;

public class MaxTwo {
	//键盘录入两个数据，返回较大值
	public static int myMax(int num1,int num2) {
		int maxNum = num1 > num2 ? num1 : num2;
		return maxNum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数：");
		int num2 = sc.nextInt();
		//方法调用
		int result = myMax(num1,num2);
		System.out.println("较大值为："+ result);
		
		//方法调用2
		boolean result1 = myEq(num1,num2);
		System.out.println(result1);
		
		//方法调用3
		
	}
	
	
	//键盘录入两个数据，比较两个数是否相等
	public static boolean myEq(int num1,int num2) {
		//boolean result = num1 == num2;
		boolean result = false;
		if (num1 == num2) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	
	//键盘录入三个数据，返回三个数中的最大值
	
}
