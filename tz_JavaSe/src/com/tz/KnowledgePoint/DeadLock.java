package com.tz.KnowledgePoint;
/*
 * 	多线程死锁
 */
class Tickets implements Runnable {
	private boolean flag = true;
	
	public Tickets(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		if (flag) {
			synchronized (myLock.LOCKA) {
				System.out.println(Thread.currentThread().getName() +"...LOCKA");
				synchronized (myLock.LOCKB) {
					System.out.println(Thread.currentThread().getName() +"...LOCKB");
				}
			}
		} else {
			synchronized (myLock.LOCKB) {
				System.out.println(Thread.currentThread().getName() +"...LOCKB");
				synchronized (myLock.LOCKA) {
					System.out.println(Thread.currentThread().getName() +"...LOCKA");
				}
			}
		}
	}
}

class myLock {
	public static final Object LOCKA = new Object();
	public static final Object LOCKB = new Object();
}

public class DeadLock {
	public static void main(String[] args) {
		Tickets t1 = new Tickets(true);
		Tickets t2 = new Tickets(false);
		new Thread(t1).start();
		new Thread(t2).start();
	}
}
