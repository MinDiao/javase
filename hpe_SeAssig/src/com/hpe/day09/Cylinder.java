package com.hpe.day09;

public class Cylinder extends Circle {
	private double hight;
	
	public void setHight(double hight) {
		this.hight = hight;
	}
	
	public double getHight() {
		return hight;
	}
	
	/*public Cylinder() {
		
	}*/
	public Cylinder(double r, double hight) {
		/*super.setRadius(r);*/
		super(r);
		this.setHight(hight);
	}
	
	//获取圆柱的体积
	public double getVolume() {
		return super.getArea() * this.getHight();
	}
	
	//输出圆柱体积
	public void showVolume() {
		System.out.println("圆柱体积为"+ this.getVolume());
	}
}
