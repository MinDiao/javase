package com.hpe.day08;

public class Vehicle {
	private int speed;
	private int size;
	public Vehicle() {
		
	}
	public Vehicle(int speed, int size) {
		this.setSpeed(speed);
		this.setSize(size);
	}
	//设置速度
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	//显示
	public void show() {
		System.out.println("速度："+this.getSpeed()+" 体积："+this.getSize());
	}
	//移动
	public void move() {
		
	}
	//加速
	public void speedUp() {
		
	}
	//减速
	public void speedDown() {
		
	}
}
