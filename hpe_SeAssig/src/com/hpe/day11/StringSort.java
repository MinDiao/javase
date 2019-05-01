package com.hpe.day11;
/*
 * 题目：字符串排序。
 */
public class StringSort {
	public static void main(String[] args) {
		String str = "sdfjklwer";
		//将字符串转换为字符数组
		char[] arr = str.toCharArray();
		//排序
		char temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		//将字符转换为字符串，不能使用to.String()
		String str1 = String.valueOf(arr);
		System.out.println(str1);
	}
}
