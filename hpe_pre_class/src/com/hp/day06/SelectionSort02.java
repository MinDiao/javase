package com.hp.day06;
/*
 * 选择排序2
 */
public class SelectionSort02 {
	public static void main(String[] args) {
		int arr[] = {42,12,65,85,25,32,42,54,65,32,13};
		int temp = 0;
		//外循环取决于元素个数
		for (int i = 0; i < arr.length - 1; i++) {
			//min用来记录数组中最小值的索引
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			//每趟a[i]与最小值交换
			if (min != i) {
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		//System.out.println(Arrays.toString(arr));
		
		/*int e = 0;
		for (int i : arr) {
			e++;
			if (e == arr.length) {
				System.out.print(i);
			} else {
				System.out.print(i +",");
			}
		}*/
		
		/*for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] +",");
			}
		}*/		
	}
}
