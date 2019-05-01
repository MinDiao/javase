package com.hpe.day10;

public class CarPersonCarTest {
	public static void main(String[] args) {
		Person p = new Person();
		Car c1 = new Benz();
		p.car = c1;
		p.drive();
		
		Car c2 = new JD();
		p.car = c2;
		p.drive();
	}
}
