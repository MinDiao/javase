package com.hpe.day05;

import java.util.Scanner;

public class YangHuiTriangle02 {
	
	public static void main(String[] args) {
		
		long i,j,n,k;
		System.out.println("请输入");
		n = new Scanner(System.in).nextInt();
		
		for(i = 1; i <= n; i++) {
			k = 1;
			for(j = 1; j < i; j++) {
				System.out.print(k);
				k = k * (i - j) / j;
			}
			System.out.println();
		}
		
	}
	
}
