package com.hpe.day18;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("主线程："+ Thread.currentThread().getName());
		TestThread tt = new TestThread("子线程");
		tt.start(); //其实是在调用run()方法
		Thread.sleep(1000);
		System.out.println("end");
	}

}
