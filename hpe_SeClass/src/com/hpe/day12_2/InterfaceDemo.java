package com.hpe.day12_2;

public class InterfaceDemo {
	
	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		b.stop();
		
		Bus bus = new Bus();
		bus.start();
		bus.stop();
	}
	
}
