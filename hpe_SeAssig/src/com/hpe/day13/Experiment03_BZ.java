package com.hpe.day13;
/*
 * 	实验任务
   	包装类之间转换
   	包装类对象转换为对应的基本数据类型变量
 */
public class Experiment03_BZ {
	/*将其转换为double类型并输出*/
	public static double cell(String str) {
		return Integer.parseInt(str);
	}
	
	/*使用Double类创建double类型变量db并赋值1234*/
	public static Double cell2() {
		Double db = new Double(1234);
		return db;
	}
	
	public static void main(String[] args) {
		/*定义一个String str = "1234";*/
		String str = "1234";
		double d1 = cell(str);
		Double d2 = cell2();
		System.out.println(d1);
		System.out.println(d2);
		
		/*比较两者是否一致*/
		if (d1 == d2) {
			System.out.println(true);
		} else {
			System.out.println();
		}
	}
}
