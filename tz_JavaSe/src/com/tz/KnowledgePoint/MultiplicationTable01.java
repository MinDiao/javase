package com.tz.KnowledgePoint;
/*
 * for循环打印乘法口诀表: 思路一
 */
public class MultiplicationTable01 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) { //外行
			for (int j = 1; j <= i; j++) { //内列
				System.out.print(j +"*"+ i +"="+ i * j +"\t");
			}
			System.out.println();
		}
	}
}
