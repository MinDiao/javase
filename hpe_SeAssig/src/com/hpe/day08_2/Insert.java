package com.hpe.day08_2;

import java.util.Scanner;

public class Insert {
	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 6, 14, 25, 36, 37,55};
		//创建一个比a数组多一位的b数组
		int[] b = new int[a.length+1];
		int t1 = 0, t2 = 0;   
		int i = 0;
		//输入
		Scanner s= new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = s.nextInt();
		
		/*判断插入值与原数组的关系*/
		if(num >= a[a.length-1]) {//插入的数值大于等于原数组最后一位
			b[b.length-1] = num;//插入到最后一位
			for(i=0; i<a.length; i++) {
				b[i] = a[i];//将原数组插入到新数组
			}
		} else {//插入的数值不大于等于原数组最后一位
			for(i=0; i<a.length; i++) {
				if(num >= a[i]) {//插入数值大于原数组
					b[i] = a[i];//将原数组先插入新数组中
				} else {//插入数值小于原数组
					b[i] = num;//先将此数值插入到新数组中
					break;
				}
			}
			for(int j=i+1; j<b.length; j++) {
				b[j] = a[j-1];//将剩下的原数组插入新数组中
			}
		}
		
		/*遍历*/
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
