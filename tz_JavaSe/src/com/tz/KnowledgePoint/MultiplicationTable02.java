package com.tz.KnowledgePoint;
/*
 * for循环打印乘法口诀表: 思路二
 */
public class MultiplicationTable02 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) { //外行
			for (int j = 1; j <= i; j++) { //内列
				if (j != i) {
					System.out.print(j +"*"+ i +"="+ i * j +"\t");
				} else {
					System.out.println(j +"*"+ i +"="+ i * j);
				}
			}
		}
	}
}
