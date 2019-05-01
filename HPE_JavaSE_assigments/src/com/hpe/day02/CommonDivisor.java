package com.hpe.day02;
/*
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。   
 * 思路:在循环中，只要除数不等于0，用较大数除以较小的数，
 * 将小的一个数作为下一轮循环的大数，取得的余数作为
 * 下一轮循环的较小的数，如此循环直到较小的数的值为0，
 * 返回较大的数，此数即为最大公约数，最小公倍数为两数
 * 之积除以最大公约数。
 */
import java.util.Scanner;

public class CommonDivisor {
	public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入第一个整数:\n");
        int a = scan.nextInt();
        System.out.print("请输入第二个整数:\n");
        int b = scan.nextInt();
        Max_Min(a,b);
    }
    public static void Max_Min(int a,int b){
        int i = a;
        int j = b;
        int x =0,y =0;
        if(a < b){
            x = b;
            b = a;
            a = x;
        }
        while(b != 0){
            y = a % b;
            a = b;
            b = y;
        }
        //最小公倍数
        int t = i * j / a;
        System.out.println(i+"和"+j+"的最大公约数为："+ a);
        System.out.println(i+"和"+j+"的最小公倍数为："+ t);  
    }
}
