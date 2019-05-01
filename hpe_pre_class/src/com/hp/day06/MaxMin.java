package com.hp.day06;
/*
 * 数组元素最大值或最小值
 */
public class MaxMin {
	public static void main(String[] args) {
		//假设数组中的第一个数是最大的a[0],拿这个a[0]与后面的每个数比较，
		//后面的如果有更大的数，则把这个更大的数给a[0]
		int arr[] = {42,12,65,85,25,32,42,54,65,32,13};
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
