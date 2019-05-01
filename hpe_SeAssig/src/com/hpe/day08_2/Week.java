package com.hpe.day08_2;

import java.util.Scanner;

public class Week {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一位");
		switch (sc.next()) {
			case "m":
				System.out.println("星期一");
				break;
			case "w":
				System.out.println("星期三");
				break;
			case "f":
				System.out.println("星期五");
				break;
			case "t":
				System.out.println("请输入第二位");
				switch (sc.next()) {
					case "u":
						System.out.println("星期二");
						break;
					case "h":
						System.out.println("星期四");
						break;
				}
				break;
			case "s":
				System.out.println("请输入第二位");
				switch (sc.next()) {
					case "a":
						System.out.println("星期六");
						break;
					case "u":
						System.out.println("星期日");
						break;
				}
				break;
		}
		sc.close();
	}
}
