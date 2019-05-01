package com.tz.assigments04;

import java.util.Scanner;

/*
 * 4.分析以下需求，并用代码实现： 
	(1)从键盘循环录入录入一个字符串,输入"end"表示结束 
	(2)将字符串中大写字母变成小写字母，小写字母变成大写字母，其它字符用"*"代替,并统计字母的个数 
	举例: 
		键盘录入：Hello12345World 
		输出结果：hELLO*****wORLD 总共10个字母
 */
public class Fourth {
	public static void main(String[] args) {
		String str1 = Info1();
		System.out.println(cell(str1));
	}
//	判断输入内容
	public static char[] cell(String s) {
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'A' && c[i] <= 'Z') {
				c[i] += 32;
			} else if(c[i] >= 'a' && c[i] <= 'z') {
				c[i] -= 32;
			} else {
				c[i] = '*';
			}
		}
		return c;
	}
//	输入end -> 方法一:老师: 必须另起一行输入"end"
	public static String Info() {
		Scanner sc = new Scanner(System.in);
		StringBuffer s = new StringBuffer();
		while (true) {
			String str = sc.next();
			if (str.endsWith("end")) {
				break;
			} else {
				s.append(str);
			}
		}
		return s.toString();
	}
//	方法二:自己: 可以同一行输入"end"
	public static String Info1() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while (true) {
			str += sc.next();
			if (str.endsWith("end")) {
				break;
			}
		}
		return str.replace("end","");
	}
}
