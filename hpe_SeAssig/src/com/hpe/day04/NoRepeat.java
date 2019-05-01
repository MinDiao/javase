package com.hpe.day04;
/*
 * 	有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
public class NoRepeat {
	public static void main(String[] args) {
		//初始化计数器,如果下面的if判断不成功则不会执行,于是直接初始化1
		int num = 1;
		//将三个数以三层循环形式输出
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int j2 = 1; j2 <= 4; j2++) {
					//三个数不重复的情况
					if (i != j && i != j2 && j != j2) {
						System.out.println(""+i+j+j2);//注意此处用""类型将数据类型隐式转换为String类型,方便拼接
						//计数器自增
						num++;
					}
				}
			}
		}
		System.out.println("有"+ num +"次");
	}
}
