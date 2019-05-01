package com.hpe.day03;

public class Test {
	public static void main(String[] args) {
		/*int i = 0;
		int j = 8;
		while(i++ < 6){
			j--;
		}
		System.out.println(i+","+j);*/
		
		
		
		
		/*int i = 0;
		int j = 3;
		do {
			j--;
		} while (i++<=1);
		System.out.println(i+","+j);*/
		
	}
	public static void run() {
		int i = 0;
		int j = 5;
		do {
			j--;//4 ,3 2 1 0
		}while(i++ <= 3);//0 1 2 3 4, 5
		System.out.println(i+","+j);
	}
	
	public static void run2() {
		int i = 0;
		int j = 5;
		while(i < 5) {
			while(j > 3) {
				i--;
				if(j == 4) {
					break;
				}
			}
			i++;
		}
		System.out.println(i+","+j);
	}
	
	public static void run3() {
		int i = 0;
		int j = 5;
		while (i++ < 5) {
			while (j-- > 3) {
				if (j == 4) {
					continue;
				}
			}
		}
		System.out.println(i+","+j);
	}
}
