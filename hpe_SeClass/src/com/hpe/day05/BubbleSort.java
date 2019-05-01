package com.hpe.day05;
/*
 * 冒泡排序法：小的排到上面
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] ages = new int[] {3,2,4,6};
		for (int i = ages.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (ages[j] > ages[j + 1]) {
					int temp = ages[j];
					ages[j] = ages[j + 1];
					ages[j + 1] = temp;
				}
			}
		}
	}
}
