package com.hpe.day02;

import java.util.Scanner;

/*
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */
public class Count {
	public static void main(String[] args) {
		//键盘录入字符串
		System.out.println("请输入任意");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//StringBuilder sb = new StringBuilder();
		//将字符串转换为字符数组
		char[] c = str.toCharArray();
		//初始化统计的个数
		int enMin = 0;
		int enMax = 0;
		int num = 0;
		int other = 0;
		//进行循环
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 97 && c[i] <= 122) {//小写英文字母的ASCII码
				enMin++;
			} else if(c[i] >= 65 && c[i] <= 90) {//大写英文字母的ASCII码
				enMax++;
			} else if(c[i] >= '0' && c[i] <= '9') {//数字字符
				num++;
			} else {//其它字符
				other++;
			}
		}
		//输出
		System.out.println("小写字母个数为"+enMin);
		System.out.println("大写字母个数为"+enMax);
		System.out.println("数字个数为"+num);
		System.out.println("其它个数为"+other);
	}
}
