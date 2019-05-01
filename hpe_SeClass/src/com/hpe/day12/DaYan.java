package com.hpe.day12;

public class DaYan extends Bird implements FlyAnimals {

	@Override
	public void fly() {
		System.out.println("大雁"+super.leg+"条腿，"+"，在飞");
	}

	@Override
	public void rawEgg() {
		System.out.println("大雁"+super.leg+"条腿，"+"，在生蛋");
	}

}
