package com.tz.assigments01;
/*
 *	 三个售票窗口同时出售20张票;   
	程序分析：
	1.票数要使用同一个静态值  
	2.为保证不会出现卖出同一个票数，要java多线程同步锁。 
	设计思路：
	1.创建一个站台类Station，继承Thread，重写run方法，在run方法里面执行售票操作！售票要使用同步锁：即有一个站台卖这张票时，其他站台要等这张票卖完！ 
	2.创建主方法调用类
 */
class Station2 implements Runnable {
	static int ticket = 20; //静态变量,防止票数混乱
	private Object lock = new Object();
	public void run() {
		while (ticket > 0) {
			synchronized (this) { //创建同步锁
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() +"站台卖的第"+ ticket +"票");
					ticket--;
				}
			}
			try {
				Thread.sleep(1000); //创建线程休眠
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SaleTicket02 {
	public static void main(String[] args) {
		Station2 s = new Station2();
		new Thread(s,"站台A").start();
		new Thread(s,"站台B").start();
		new Thread(s,"站台C").start();
	}
}
