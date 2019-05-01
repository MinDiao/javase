package com.hpe.day12;

import java.util.Scanner;

/*
 * 	题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。  
 */
public class Number {

	public static void main(String[] args) {
		/*循环输入*/
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入"+ (i + 1) +"个数");
			arr[i] = sc.nextInt();
		}
		
		/*打印*/
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
