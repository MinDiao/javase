package com.hpe.day13;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *	 实验任务
   	Date类常用方法
 */
public class Experiment04_Date {
	/*获得当前日期和时间对象date*/
	public static Date cell() {
		Date date = new Date();
		return date;
	}
	
	/*定义对象Date date1 = new Date(36000000);获得包含的日期和时间*/
	public static String cell2() {
		Date date1 = new Date(36000000);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		return sdf.format(date1);
	}

	public static void main(String[] args) {
		Date date = cell();
		String date1 = cell2();
		System.out.println(date);
		System.out.println(date1);
		
		/*比较date和date1是否相等*/
		if (date.equals(date1)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}
}
