package com.hp.day06;

public class Test01 {
	public static void change(int a,int b) {
		System.out.println("a"+a+","+"b"+b);//10,20
		a = b;//20
		b = a + b;//40
		System.out.println("a"+a+","+"b"+b);//20,40
	}
	
	public static void change(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] *= 2;
			}
		}
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a"+a+","+"b"+b);//10,20
		change(a,b);//方法调用不改变地址的值
		System.out.println("a"+a+","+"b"+b);//10,20
		
		int[] arr = {1,2,3,4,5};//{1,4,3,8,5}
		change(arr);
		System.out.println(arr[1]);//4 //数组是在堆空间内值会发生改变
	}
}
