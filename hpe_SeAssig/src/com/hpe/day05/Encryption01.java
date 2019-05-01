package com.hpe.day05;

import java.util.Scanner;
/*
 * 数据加密问题:
 	某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
 	加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，
 	再将第一位和第四位交换，第二位和第三位交换。
 */
public class Encryption01 {
	public static void main(String[] args) {
		//获取四位数
		System.out.println("请输入");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//拆分千、百、十、个各个数，放到一个int[]中
		int[] arr = new int[4];
		arr[0] = input / 1000;
		arr[1] = input / 100 % 10;
		arr[2] = input / 10 % 10;
		arr[3] = input % 10;
		//加密：加5、%10
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] + 5) % 10;
		}
		System.out.println(MyRev1(arr));
	}
	
	public static int[] MyRev(int[] arr) {
		//数组逆序,方法一
		int temp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return arr;
	}
	
	public static int[] MyRev1(int[] arr) {
		//数组逆序,方法二
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		return arr;
	}
}
