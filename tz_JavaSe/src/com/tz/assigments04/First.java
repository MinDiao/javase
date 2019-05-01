package com.tz.assigments04;
/*
 * 1.用代码演示String类中的以下方法的用法 
 */
public class First {
	static String str = "  sdjfDDlkDs  ASFSsdfSDFSD2334水电费";
//	(1)boolean isEmpty(): 判断字符串是不是空串,如果是空的就返回true 
	public static boolean cell() {
		return str.isEmpty();
	}
//	(2)char charAt(int index): 返回索引上的字符 
	public static char cell1() {
		return str.charAt(18);
	}
//	(3)String toLowerCase(): 字符串转成小写 
	public static String cell2() {
		return str.toLowerCase();
	}
//	(4)String toUpperCase(): 字符串转成大写 
	public static String cell3() {
		return str.toUpperCase();
	}
//	(5)String repalce(char oldChar, char newChar): 将字符串中的老字符,替换为新字符 
	public static String cell4() {
		return str.replace('D', 'z');
	}
//	(6)String repalce(String old, String newstr): 将字符串中的老字符串,替换为新字符串 
	public static String cell5() {
		return str.replace("sdf", "xxxxxxXXXXXX");
	}
//	(7)String trim(): 去掉字符串两端空格
	public static String cell6() {
		return str.trim();
	}
	public static void main(String[] args) {
		System.out.println(cell());
		System.out.println(cell1());
		System.out.println(cell2());
		System.out.println(cell3());
		System.out.println(cell4());
		System.out.println(cell5());
		System.out.println(cell6());
	}
}
