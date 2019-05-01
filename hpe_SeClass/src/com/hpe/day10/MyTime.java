package com.hpe.day10;
/*
 * 在程序中，经常要对时间进行操作，但是并没有时间类型的数据。那么，我们可以自己实现一个时间类，来满足程序中的需要。
	定义名为MyTime的类，其中应有三个整型成员：时（hour），分（minute），秒（second），
	为了保证数据的安全性，这三个成员变量应声明为私有。
	为MyTime类定义构造方法，以方便创建对象时初始化成员变量。
	再定义diaplay方法，用于将时间信息打印出来。
	重载一组构造方法，以方便使用者能够以多种形式初始化该类的实例。
 */
public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public MyTime(int hour, int minute, int second) {
		this.setHout(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}
	//重载构造方法
	public MyTime(int hour) {
		this.setHout(hour);
	}
	public MyTime(int minute, int second) {
		this.setMinute(minute);
		this.setSecond(second);
	}

	public void setHout(int hour) {
		if (hour < 0 || hour > 23) {
			System.out.println("小时不能为负数，或者不能超过23");
			return;
		}
		this.hour = hour;
	}
	public int getHour() {
		return hour;
	}
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			System.out.println("分钟不能为负数，或者不能超过59");
			return;
		}
		this.minute = minute;
	}
	public int getMinute() {
		return minute;
	}
	public void setSecond(int second) {
		if (minute < 0 || minute > 59) {
			System.out.println("秒不能为负数，或者不能超过59");
			return;
		}
		this.second = second;
	}
	public int getSecond() {
		return second;
	}
	//打印时间
	public void display() {
		System.out.println(this.getHour()+"时"+this.getMinute()+"分"+this.getSecond()+"秒");
	}

	/*加*/
	//小时
	public void addHour(int hour) {
		this.hour = (this.hour + hour) % 24;
	}
	//分钟
	public void addMinute(int minute) {
		int tempHour = 0;
		tempHour = (this.minute + minute) / 60;
		this.minute = (this.minute + minute) % 60;
		addHour(tempHour);
	}
	//秒
	public void addSecond(int second) {
		int tempMinute = 0;
		tempMinute = (59 - (this.second + second)) / 60;
		addMinute(tempMinute);
		this.second = (60 + this.second + second % 60) % 60;
	}

	/*减*/
	//小时
	public void subHour(int hour) {
		this.hour = (24 + this.hour - hour % 24) % 24;
	}
	//分钟
	public void subMinute(int minute) {
		int tempHour = 0;
		if (this.minute < second) {
			tempHour = (minute / 60) + 1;
			subHour(tempHour);
		}
		this.minute = (60 + this.minute - minute % 60) % 60;

	}
	//秒
	public void subSecond(int second) {
		int tempMinute = 0;
		/*if (this.second < second) {
			tempMinute = (second / 60) + 1;
			subSecond(tempMinute);
		}*/
		tempMinute = (59 - (this.second - second)) / 60;
		subMinute(tempMinute);
		this.second = (60 + this.second - second % 60) % 60;
	}
}
