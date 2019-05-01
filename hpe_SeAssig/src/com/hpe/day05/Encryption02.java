package com.hpe.day05;

import java.util.Scanner;
/*
 * 某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安
	全，在传递过程中需要加密，加密规则如下：
	首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替
	该数字，最后将第一位和最后一位数字交换。
	请任意给定一个小于8位的整数，然后，把加密后的结果在控制台打印
	出来
 */
public class Encryption02 {
	//数组逆序封装
	public static void myRev(int[] src) {
		int temp = 0;
		for(int i = 0; i < src.length / 2; i++) {
			temp = src[i];
			src[i] = src[src.length - i - 1];
			src[src.length - i - 1] = temp;
		}
	}
	//加密封装
	public static void myEnp(int[] src) {
		//将没位数字都加上5，再用和除以10的余数代替该数字
		for(int i = 0; i < src.length; i++) {
			src[i] = (src[i] + 5) % 10;
		}
		//最后将第一位和最后一位数字交换
		int temp = src[0];
		src[0] = src[src.length - 1];
		src[src.length - 1] = temp;
	}
	
	public static void main(String[] args) {
		//从控制台获取输入的整数
		System.out.println("请输入");
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		//确定整数的长度，将long转换为字符串
		String tempStr = "" + input;
		//并根据字符串长度创建一个int[]
		int count = tempStr.length();
		int[] src = new int[count];
		//求出数
		for(int i = 0; i < count; i++) {
			src[count - i - 1] = (int)(input % 10);
			input = input / 10;//为了下一次遍历
		}
		//数组逆序
		myRev(src);
		//加密
		myEnp(src);
		//遍历数组
		for (int i : src) {
			System.out.print(i);
		}
	}
}
