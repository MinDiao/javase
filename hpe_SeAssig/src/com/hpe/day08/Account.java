package com.hpe.day08;

public class Account {
	private int user;
	private double balance;
	public void setUser(int user) {
		this.user = user;
	}
	public int getUser() {
		return user;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public Account() {
		
	}
	public Account(int user, double balance) {
		this.setUser(user);
		this.setBalance(balance);
	}
	//存款
	public void deposit(double money) {
		balance += money;
	}
	//取款
	public void withdrawa(double money) {
		balance -= money;
	}
	//余额查询
	public void query() {
		System.out.println(balance);
	}
}
