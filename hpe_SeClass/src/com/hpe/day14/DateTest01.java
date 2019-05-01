package com.hpe.day14;

import java.util.Calendar;
import java.util.Date;
/*Date常用方法*/
public class DateTest01 {
	public static void main(String[] args) {
		Date d = new Date();
		Calendar rightNow = Calendar.getInstance();
		rightNow.add(Calendar.DAY_OF_YEAR, 5);
		System.out.println(rightNow.get(Calendar.DAY_OF_WEEK) - 1);
	}
}
