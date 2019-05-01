package com.hpe.day12;

public class MaYi extends Insect implements FlyAnimals {

	@Override
	public void fly() {
		//System.out.println("蚂蚁"+super.leg+"条腿，"+"，不能飞");
	}

	@Override
	public void rawEgg() {
		//System.out.println("蚂蚁"+super.leg+"条腿，"+"，不能生蛋");
	}

}
