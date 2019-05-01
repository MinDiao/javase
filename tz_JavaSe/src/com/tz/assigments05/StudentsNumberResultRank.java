package com.tz.assigments05;

import java.util.Scanner;
/*
 * 输入学生人数, 以及对应的成绩, 进行普通遍历输出, 以及排序输出
 */
public class StudentsNumberResultRank {
	public static void main(String[] args) {
		System.out.println("请输入学生人数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		int i = 0;
		while (num > 0) {
			System.out.println("请输入第"+ ++i +"个学生成绩");
			int score = sc.nextInt();
			arr[i - 1] = score;
			num--;
		}
		
		//普通遍历
		System.out.print("成绩信息:[");
		int j2 = 0;
		for (int j : arr) {
			j2++;
			if (j2 == arr.length) {
				System.out.print(j);
			} else {
				System.out.print(j +",");
			}
		}
		System.out.println("]");
		
		//排序
		System.out.print("成绩排名:[");
		for (int j = 0; j < arr.length; j++) {
			for (int j3 = 0; j3 < arr.length - j - 1; j3++) {
				if (arr[j3] > arr[j3 + 1]) {
					int temp = arr[j3];
					arr[j3] = arr[j3 + 1];
					arr[j3 + 1] = temp;
				}
			}
		}
		//排序后的遍历
		int e = 0;
		for (int x : arr) {
			e++;
			if (e == arr.length) {
				System.out.print(x);
			} else {
				System.out.print(x +",");
			}
		}
		System.out.println("]");
	}
}
