package com.hpe.day08;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public MyTime() {
		
	}
	public MyTime(int hour, int minute, int second) {
		this.setHout(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}
	public void setHout(int hour) {
		this.hour = hour;
	}
	public int getHour() {
		return hour;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getMinute() {
		return minute;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getSecond() {
		return second;
	}
	//打印时间
	public void display() {
		System.out.println(this.getHour()+"时"+this.getMinute()+"分"+this.getSecond()+"秒");
	}
	
	//加时
	public int addHour(int hour){
		this.hour += hour;
		return hour;
	}
	//减时
	public int addMinute(int minute){
		this.minute += minute;
		return minute;
	}
	//加分
	public int addSecond(int second) {
		this.second += second;
		return second;
	}
	//减分
	public int subHour(int hour){
		this.hour -= hour;
		return hour;
	}
	//加秒
	public int subMinute(int minute){
		this.minute -= minute;
		return minute;
	}
	//减秒
	public int subSecond(int second){
		this.second -= second;
		return second;
	}
	
	public void display2() {
		System.out.println(hour+"时"+minute+"分"+second+"秒");
//		System.out.println(this.getHour()+"时"+this.getMinute()+"分"+this.getSecond()+"秒");
	}
}
