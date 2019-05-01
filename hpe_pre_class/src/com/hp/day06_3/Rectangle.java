package com.hp.day06_3;

public class Rectangle {
	private int rlength;
	private int rwidth;
	public Rectangle(int rlength,int rwidth) {
		this.rlength = rlength;
		this.rwidth = rwidth;
	}
	public void setRlength(int rlength) {
		this.rlength = rlength;
	}
	public int getRlength() {
		return rlength;
	}
	public void setRwidth(int rwidth) {
		this.rwidth = rwidth;
	}
	public int getRwidth() {
		return rwidth;
	}
	
	//周长
	public int perimeter() {
		return (rlength + rwidth) * 2;
	}
	//面积
	public int area() {
		return rlength * rwidth;
	}
}
