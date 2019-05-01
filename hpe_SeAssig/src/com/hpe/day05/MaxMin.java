package com.hpe.day05;
/*
 * 最大最小值
 */
public class MaxMin {
	public static void main(String[] args) {
		int[] arr = {42,12,65,85,25,32,42,54,65,32,13};
		System.out.println(Max(arr));
		System.out.println(Min(arr));
	}
	//
	public static int Max(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	//
	public static int Min(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
}
