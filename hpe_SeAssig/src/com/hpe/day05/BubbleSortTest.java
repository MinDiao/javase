package com.hpe.day05;

public class BubbleSortTest {
	
	public static void main(String[] args) {
		
		int arr[] = {42,12,65,85,25,32,42,54,65,32,13}; //静态初始化
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1]; 
					arr[j + 1] = temp;
				}
			}
		}
		// 遍历数组
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] +",");
			}
		}
		
	}
	
}
