package com.hpe.day12_2;

public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("自行车运行");
	}

	@Override
	public void stop() {
		System.out.println("自行车停止");
	}

}
