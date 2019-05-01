package com.hpe.day14;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/*Date常用方法*/
public class DateFormatTest02 {
	public static void main(String[] args) {
		Date d = new Date();
		Locale locale = new Locale("zh", "CN");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss EE");
		System.out.println(df.format(d));
	}
}
