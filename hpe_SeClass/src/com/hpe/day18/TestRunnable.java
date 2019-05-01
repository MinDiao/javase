package com.hpe.day18;

public class TestRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("当前线程为："+ Thread.currentThread().getName());
	}

}
