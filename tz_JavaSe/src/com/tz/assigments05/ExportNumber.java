package com.tz.assigments05;
/*
 * 	输出100以内的数, 逢有9的数字跳过, 且一行输出5个数:
 */
public class ExportNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		for (int i = 0; i < 100; i++) {
			if (i / 19 == 9 || i % 10 == 9) {
				continue;
			}
			System.out.print(i +"\t");
			num++;
			if (num == 5) {
				num = 0;
				System.out.println();
			}
		}

	}

}
