package com.hpe.day08;

public class MyTimeTest {
	public static void main(String[] args) {
		MyTime mt = new MyTime(3,5,7);
		mt.display();
		mt.addHour(5);
		mt.addMinute(8);
		mt.addSecond(10);
		mt.display2();
	}
}
