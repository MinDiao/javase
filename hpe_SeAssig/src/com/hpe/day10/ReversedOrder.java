package com.hpe.day10;
/*
 * 将一个数组逆序输出
 */
public class ReversedOrder {
	public static void main(String[] args) {
		int arr[] = {42,12,65,85,25,32,42,54,65,32};
		int temp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		//遍历
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] +",");
			}
		}
	}
}
