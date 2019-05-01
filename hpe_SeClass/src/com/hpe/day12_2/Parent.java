package com.hpe.day12_2;

public class Parent implements Person {

	@Override
	public void eat() {
		System.out.println("在招待所吃饭");
	}

	@Override
	public void sleep() {
		System.out.println("在招待所住宿");
	}

}
