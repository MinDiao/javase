package com.hpe.day11;
/*
 * 题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
 */
import java.util.Scanner;

public class StringLength {
	public static int cell(String str) {
		//返回传入字符串长度
		return str.length();
	}
	public static void main(String[] args) {
		//输入字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		System.out.println(cell(sc.next()));
		sc.close();
	}
}
