package com.tz.assigments01;
/*
 * 	设计一个线程操作类，要求可以产生三个线程对象，并可以分别设置三个线程的休眠时间，如下所示：
	线程A，休眠10秒
	线程B，休眠20秒
	线程C，休眠30秒
	要求：
	采用以下两种方式方式分别实现该功能：
	1,Tread类
	2，Runnable
	
 *	 继承Thread方法
 */
class MyThread1 extends Thread {
	private int time;
	public MyThread1(String name, int time) { //通过构造方法获取名字和时间
		super(name);
		this.time = time;
	}
	public void run() {
		try {
			Thread.sleep(this.time); //创建线程休眠
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"线程"+ this.time +"毫秒");
	}
}

public class TimeThread {
	public static void main(String[] args) {
		new MyThread1("A",1000).start();
		new MyThread1("B",2000).start();
		new MyThread1("C",3000).start();
	}
}
