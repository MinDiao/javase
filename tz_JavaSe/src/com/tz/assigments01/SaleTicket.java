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
class Station extends Thread {
	public Station(String name) {
		super(name);
	}
	static int ticket = 20;
	private Object lock = new Object();
	public void run() {
		while(ticket > 0) {
			synchronized (lock) {
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() +"站台卖的第"+ ticket +"张票");
					ticket--;
				}
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SaleTicket {
	public static void main(String[] args) {
		new Station("A站台").start();
		new Station("B站台").start();
		new Station("C站台").start();
	}
}
