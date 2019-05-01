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
	
 * 	接口Runnable方法
 */
class MyThread2 implements Runnable {
	private String name;
	private int time;
	public MyThread2(String name,int time) { //通过构造函数获取名字和时间
		this.name = name;
		this.time = time;
	}
	public void run() {
		try {
			Thread.sleep(this.time); //创建线程休眠
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.name+"线程"+ this.time +"毫秒");
	}
}

public class TimeRunnable {
	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2("A",1000);
		MyThread2 mt2 = new MyThread2("B",2000);
		MyThread2 mt3 = new MyThread2("C",3000);
		new Thread(mt1).start();
		new Thread(mt2).start();
		new Thread(mt3).start();
	}
}
