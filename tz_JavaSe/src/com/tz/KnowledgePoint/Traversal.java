package com.tz.KnowledgePoint;
/*
 * 	一维~三维数组的for遍历和foreach遍历
 */
public class Traversal {
	//一维数组for遍历
	private static void cell() {
		int arr[] = {42,12,65,85,25,32,42,54,65,32,13}; //静态初始化
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] +",");
			}
		}
	}
	
	
	
	//二维数组for遍历
	private static void cell1() {
		System.out.println();
		int arr[][] = {{42,12},{65,85},{25,32},{42,54},{65,32}}; //静态初始化
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == arr.length - 1 && j == arr[i].length - 1) {
					System.out.print(arr[i][j]);
				} else {
					System.out.print(arr[i][j] +",");
				}
			}
		}
	}
	
	//三维数组for遍历
	private static void cell2() {
		System.out.println();
		int arr[][][] = {{{42,12,65},{85,25,32},{42,54,65},{32,13,46}}}; //静态初始化
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int j2 = 0; j2 < arr[i][j].length; j2++) {
					if (i == arr.length - 1 && j == arr[i].length - 1 && j2 == arr[i][j].length - 1) {
						System.out.print(arr[i][j][j2]);
					} else {
						System.out.print(arr[i][j][j2] +",");
					}
				}
			}
		}
	}
	
	//一维数组foreach遍历
	private static void cell3() {
		System.out.println();
		int arr[] = {42,12,65,85,25,32,42,54,65,32,13}; //静态初始化
		int x = 0;
		for (int i : arr) {
			x++;
			if (x == arr.length) {
				System.out.print(i);
			} else {
				System.out.print(i +",");
			}
		}
	}
	
	//二维数组foreach遍历
	private static void cell4() {
		System.out.println();
		int arr[][] = {{42,12},{65,85},{25,32},{42,54},{65,32}}; //静态初始化
		int x = 0;
		for (int i[] : arr) {
			x++;
			int y = 0;
			for (int j : i) {
				y++;
				if (x == arr.length && y == i.length) {
					System.out.print(j);
				} else {
					System.out.print(j +",");
				}
			}
		}
	}
	
	//三维数组foreach遍历
	private static void cell5() {
		System.out.println();
		int arr[][][] = {{{42,12,65},{85,25,32},{42,54,65},{32,13,46}}}; //静态初始化
		int x = 0;
		for(int i[][] : arr) {
			x++;
			int y = 0;
			for(int j[] : i) {
				y++;
				int z = 0;
				for(int j2 : j) {
					z++;
					if (x == arr.length && y == i.length && z == j.length) {
						System.out.print(j2);
					} else {
						System.out.print(j2 +",");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		cell();
		cell1();
		cell2();
		cell3();
		cell4();
		cell5();
	}
}













