package com.hp.day06;
/*
 * 数据元素对调
 */
public class InvertedOrder {
	public static void main(String[] args) {
		/*
		 * a[0]		a[a.length-1-0]
		 * a[1]		a[a.length-1-1]
		 * a[2]		a[a.length-1-2]
		 * a[3]		a[a.length-1-3]
		 */
		//注意对调次数是数组长度的一半
		int arr[] = {42,12,65,85,25,32,42,54,65,32,13};
		int temp = 0 ;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
