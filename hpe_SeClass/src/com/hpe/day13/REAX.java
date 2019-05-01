package com.hpe.day13;

import java.util.regex.Pattern;

public class REAX {
	
	public static void main(String[] args) {
		String[] arr = {"hello","google","gooogle","world"};
		for (String s : arr) {
			Boolean b = Pattern.matches("^g.*e$",s);
			if (b) {
				System.out.println(s);
			}
		}
	}
	
	public void cell() {
		String s = "   hello  ";
		System.out.println(s.trim());
	}
	
}
