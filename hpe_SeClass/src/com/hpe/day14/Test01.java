package com.hpe.day14;

public class Test01 {
	public static void main(String[] args) {
		String s1 = "1";
		String s2 = "1";
		System.out.println(s1.equals(s2));
		
		String s3 = new String("1");
		String s4 = new String("1");
		System.out.println(s3.equals(s4));
	}
}
