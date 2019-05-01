package com.hpe.day08;

public class Worker {
	private double money;
	int age;
	boolean idcard;
	public void setMoney(double money) {
		this.money = money;
	}
	public double getMoney() {
		return money;
	}
	public Worker() {
		
	}
	public Worker(double money) {
		this.setMoney(money);
	}
	public String child() {
		return this.age < 18 ? "是童工" : "不是童工";
	}
}
