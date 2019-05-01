package com.hpe.day08;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(5,3);
		v.show();
		v.move();
		v.speedUp();
		v.speedDown();
	}
}
