package com.hpe.day08;

public class Number {
	private int n1;
	private int n2;
	public Number() {
		
	}
	public Number(int n1, int n2) {
		this.setN1(n1);
		this.setN2(n2);
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN1() {
		return n1;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN2() {
		return n2;
	}
	
	//加
	public void addition() {
		System.out.println(this.getN1() + this.getN2());
	}
	//减
	public void subtration() {
		System.out.println(this.getN1() - this.getN2());
	}
	//乘
	public void multiplication() {
		System.out.println(this.getN1() * this.getN2());
	}
	//除
	public void division() {
		if (this.getN2() != 0) {
			System.out.println(this.getN1() / this.getN2());
		} else {
			System.out.println("被除数不能为0");
		}
	}
}
