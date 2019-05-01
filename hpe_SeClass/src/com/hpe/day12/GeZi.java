package com.hpe.day12;

public class GeZi extends Bird implements FlyAnimals {
	//飞
	public void fly() {
		System.out.println("鸽子"+super.leg+"条腿，"+"，在飞");
	}
	//生蛋
	public void rawEgg() {
		System.out.println("鸽子"+super.leg+"条腿，"+"，在生蛋");
	}
}
