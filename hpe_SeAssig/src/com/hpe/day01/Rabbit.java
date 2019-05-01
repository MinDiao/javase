package com.hpe.day01;

/*	题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？   
	//这是一个菲波拉契数列问题

 * S(n)=S(n-1)+S(n-2)
 */
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
