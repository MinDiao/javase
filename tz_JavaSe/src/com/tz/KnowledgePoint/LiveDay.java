package com.tz.KnowledgePoint;
/*
 * 计算活了多少天
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LiveDay {
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入出生日期，格式为：YYYY-MM-DD");
		String birthday = new Scanner(System.in).next();
		
		//日期格式化
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//传入日期
		Date brithdayDate = sdf.parse(birthday);
		
		//获取今日日期
		Date todayDate = new Date();
		
		//获取时间：秒
		long bd = brithdayDate.getTime();
		long td = todayDate.getTime();
		
		//运算：今天的时间-生日
		long secone = td - bd;
		if (secone < 0) {
			System.out.println("你还没出生呢！");
		} else {
			System.out.println(secone/1000/60/60/24 +"天");
		}
	}
}
