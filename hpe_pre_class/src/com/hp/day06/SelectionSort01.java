package com.hp.day06;
/*
 * 选择排序1
 */
public class SelectionSort01 {
	public static void main(String[] args) {
		int arr[] = {42,12,65,85,25,32,42,54,65,32,13};
		int temp = 0;
		//外循环取决于元素的个数,个数-1
		for (int i = 0; i < arr.length - 1; i++) {
			//内循环
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];//temp = 42
					arr[j] = arr[i];//a[0] = 12
					arr[i] = temp;//a[1] = 42
				}
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
