package com.tz.KnowledgePoint;
/*
 *	字符串切割（huaigege有实例）
 */
public class SplitWorld {
	public static void main(String[] args) {
		String str = "hello world";
		String arr[] = str.split(" "); //按空格进行字符串的拆分
		for (String x : arr) { //遍历输出
			System.out.println(x);
		}
	}
}
