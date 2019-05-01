package com.hpe.day02;
/*
 * 3.打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
 * 其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，
 * 因为153=1的三次方＋5的三次方＋3的三次方。 
 */
public class T_Daffodil {
	public static void main(String[] args) {
		//第一步：循环遍历100-999
		for (int i = 100; i <= 999; i++) {
		//第二步：循环遍历的同时判断该数是否为水仙花数
			//1获取该数的个位、十位、百位
				//a获取个位数%10
				int a = i % 10;
				//b获取十位数/10%10
				int b = (i / 10) % 10;
				//c获取百位数/100
				int c = i / 100;
			//2求立方和
				int sum = a*a*a+b*b*b+c*c*c;
			//3判断立方和是否等于该数本身，如果相等则输出，否则不输出
				if (sum == i) {
					System.out.println("水鲜花数为"+ i);
				}
		}
	}
}
