package com.tz.KnowledgePoint;

import java.util.Arrays;
/*
 * Arrays类的排序法
 */
public class ArraysSort {
	public static void main(String[] args) {
		int arr[] = {42,12,65,85,25,32,42,54,65,32,13};
		Arrays.sort(arr);
		int e = 0;
		for (int x : arr) {
			e++;
			if (e == arr.length) {
				System.out.print(x);
			} else {
				System.out.print(x +",");
			}
		}
	}
}
