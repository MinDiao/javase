package com.hpe.day17_2;

import java.io.Serializable;

public class Count implements Serializable {
	//默认的序列化标号
	private static final long serialVersionUID = 1L;
	String name; //户主
	int money; //当前账户余额
	public Count(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
