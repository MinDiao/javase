package com.hpe.day13;
/*
 * 	给定一个字符串数组
	{"nba","abc","cba","zz","qq","haha"}，请按照
	字典顺序进行从小到大的排序
 */
public class StringSort {
	public static void main(String[] args) {
		//将字符串赋值到字符串数组中
		String[] arr = {"nba","abc","cba","zz","qq","haha"};
		String temp = "";
		for (int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] +",");
			}
		}
	}
}
