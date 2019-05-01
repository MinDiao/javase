package com.hpe.day12_2;

public class Bus implements Vehicle {

	@Override
	public void start() {
		System.out.println("公交车运行");
	}

	@Override
	public void stop() {
		System.out.println("公交车停止");
	}

}
