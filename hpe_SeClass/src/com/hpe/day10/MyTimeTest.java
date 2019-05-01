package com.hpe.day10;

public class MyTimeTest {
	public static void main(String[] args) {
		MyTime mt = new MyTime(0,0,0);
		/*mt.display();
		
		MyTime mt1 = new MyTime(12);
		mt1.display();
		
		MyTime mt2 = new MyTime(54,36);
		mt2.display();*/
		mt.display();
		mt.subSecond(1);
		mt.display();
	}
}
