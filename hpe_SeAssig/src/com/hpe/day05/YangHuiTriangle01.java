package com.hpe.day05;

import java.util.Scanner;

/*
 *  		 1   
           1    1   
        1    2    1   
      1    3    3    1   
    1    4    6    4    1   
1    5    10    10    5    1   

 */
public class YangHuiTriangle01 {
	public static void main(String[] args) {
		//从控制台获取需要输出的行数
		System.out.println("请输入");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		//为了保存上一行的所有数据，定义一个长度为行数的数组
		int[] tempArr = new int[row];//保存上一行的数
		int[] tempArr2 = new int[row];//保存当前行的数
		//循环打印每一行
		for(int i = 1; i <= row; i++) {
			//打印空格，个数为行数-i
			for(int j = 0; j < (row - i); j++) {
				System.out.print(" ");
			}
			//打印数字+空格，个数为行数；如果为第一个或最后一个1，否则为上一行的j-1与j相加，假设当前数下标为j
			//1.打印每行的第一个数
			System.out.print("1 ");//打印第一行时就把空格加上
			tempArr2[0] = 1;
			//2.打印该行除了第一个和最后一个数
			if(i > 2) {
				for(int k = 1; k <= (i - 2); k++) {
					System.out.print(tempArr[k-1] + tempArr[k] +" ");
					tempArr2[k] = tempArr[k - 1] + tempArr[k];
				}
			}
			//3.打印该行最后一个数
			if(i > 1) {
				System.out.print("1");
				tempArr2[i - 1] = 1;
			}
			//把当前行变成上一行
			for(int t = 0; t < row; t++) {
				tempArr[t] = tempArr2[t];
			}
			System.out.println();
		}	
	}
}
