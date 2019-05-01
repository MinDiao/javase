package com.hpe.day12;

public class MiFeng extends Insect implements FlyAnimals {

	@Override
	public void fly() {
		System.out.println("蜜蜂"+super.leg+"条腿，"+"，在飞");
	}

	@Override
	public void rawEgg() {
		//System.out.println("蜜蜂"+super.leg+"条腿，"+"，不能生蛋");
	}

}
