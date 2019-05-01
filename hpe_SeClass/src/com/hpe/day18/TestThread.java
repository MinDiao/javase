package com.hpe.day18;

public class TestThread extends Thread {
	public TestThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("当前线程为："+ Thread.currentThread().getName());
	}
	
}
