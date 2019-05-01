package com.tz.assigments04;

import java.util.Scanner;
/*
 * 5.分析以下需求，并用代码实现：
 	(1)从键盘循环录入录入一个字符串,输入"end"表示结束 
	(2)定义一个方法 public Object[] deleteSubString(String str1,String str2) { }
 	(3)方法功能描述:从str1中删除所有的str2,-并返回删除后的结果,返回结果为Object[]数组 * 该数组的第一个元素为删除所有的str2后的最终的字符串 * 该数组的第二个元素为删除的str2的个数
 */
public class Fifth {
	public static void main(String[] args) {
		String str1 = Info();
		String str2 = Info();
		Object obj[] = deleteSubString(str1,str2);
		for (Object x : obj) {
			System.out.println(x);
		}
	}
//	操作
	public static Object[] deleteSubString(String str1,String str2) {
		StringBuffer s = new StringBuffer();
		s.append(str1);
		int count = 0;
		while (s.indexOf(str2) != -1) {
			s.delete(s.indexOf(str2), s.indexOf(str2) + str2.length());
			count++;
		}
		Object obj[] = {s.toString(),count};
		return obj;
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
