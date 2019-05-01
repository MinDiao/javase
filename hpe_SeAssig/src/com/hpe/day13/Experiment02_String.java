package com.hpe.day13;
/*
 * 	实验任务
    	练习String类的常用方法
 */
public class Experiment02_String {
	/*输出str长度*/
	public static int len(String str) {
		return str.length();
	}
	
	/*输出第一个"o"的索引*/
	public static void index(String str, String a) {
		System.out.println(str.indexOf(a));
		System.out.println(str.lastIndexOf(a));
	}
	
	/*输出最后一个"o"的索引*/
	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(len(str));
		index(str, "o");
		System.out.println(Replace(str));
		System.out.println(Compare(str));
	}
	
	/*将str中的字符"l"替换成"m"*/
	public static String Replace(String str) {
		return str.replace("l", "m");
	}
	
	/*字符串str按空格“ ”分割为2个字符串，比较这两个字符串是否相等*/
	public static boolean Compare(String str) {
		String[] arr = str.split(" ");
		return arr[0].equals(arr[1]);
	}
}
