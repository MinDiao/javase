package com.hpe.day18;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("主线程："+ Thread.currentThread().getName());
		TestRunnable tr = new TestRunnable();
		Thread t = new Thread(tr,"subthread");
		t.start();
		System.out.println("end");
	}

}
