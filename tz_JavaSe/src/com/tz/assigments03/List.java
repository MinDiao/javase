package com.tz.assigments03;
/*
 * 1. 编写一个 Java 应用程序，用循环结构打印如下的数值列表：
	N            10*N            	100*N          	  1000*N
	1             10                 100               1000
	2             20                 200               2000
	3             30                 300               3000
	4             40                 400               4000
	5             50                 500               5000
 */
public class List {
	public static void main(String[] args) {
		System.out.println("N\t10*N\t100*N\t1000*N");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i+"\t"+i*10+"\t"+i*100+"\t"+i*1000);
		}
	}
}
