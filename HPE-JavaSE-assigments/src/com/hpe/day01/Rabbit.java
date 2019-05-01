package com.hpe.day01;
/*
 * S(n)=S(n-1)+S(n-2)
 */
import java.util.Scanner;

public class Rabbit {
	public static void main(String[] args) {
        long s1 = 1;
        long s2 = 1;
        long temp;
        
        for (int i = 1; i <= 12; i++) {
            if (i == 1) {
                System.out.println("第" + i + "个月的兔子对数：" + s1);
                continue;
            } else if (i == 2) {
                System.out.println("第" + i + "个月的兔子对数：" + s2);
                continue;
            } else {
                temp = s2;
                s2 = s1 + s2;
                s1 = temp;
                System.out.println("第" + i + "个月的兔子对数：" + s2);
            }
        }
    }
}
