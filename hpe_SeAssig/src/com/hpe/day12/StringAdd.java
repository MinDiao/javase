package com.hpe.day12;

import java.util.Scanner;

/*
 *	 题目：两个字符串连接程序
 */
public class StringAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		//System.out.println(cell(sc.next(), sc.next()));
		System.out.println(cell1(sc.next(), sc.next()));
		sc.close();
	}
	/*直接拼接*/
	public static String cell(String num1, String num2) {
		return num1 + num2;
	}
	/*添加到缓冲流*/
	public static String cell1(String num1, String num2) {
		char[] arr = num2.toCharArray();
		StringBuilder sb = new StringBuilder(num1);
		sb = sb.append(arr);
		return sb.toString();
	}

}
