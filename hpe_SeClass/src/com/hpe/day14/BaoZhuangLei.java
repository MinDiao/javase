package com.hpe.day14;

public class BaoZhuangLei {
	public static void main(String[] args) {
		/*Integer i = new Integer(9);//装箱
		System.out.println(i);
		
		int ii = i.intValue();//拆箱
		short ss = i.shortValue();
		double dd = i.doubleValue();*/
		
		/*Integer i  = 9;
		i.toString();*/
		
		String i = new String("10");
		Integer ii = Integer.parseInt(i);
		
		Integer integer = new Integer(i);
	}
}
