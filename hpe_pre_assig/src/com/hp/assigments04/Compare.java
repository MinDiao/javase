package com.hp.assigments04;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		System.out.println(cell((byte)0, (byte)0));
		System.out.println(cell2((short)0, (short)0));
		System.out.println(cell3(130,130));
		System.out.println(cell4(465231,465231));
	}
	public static boolean cell(byte a,byte b) {
		return a == b;
	}
	public static boolean cell2(short a,short b) {
		return a == b;
	}
	public static boolean cell3(int a,int b) {
		return a == b;
	}
	public static boolean cell4(long a,long b) {
		return a == b;
	}
}
