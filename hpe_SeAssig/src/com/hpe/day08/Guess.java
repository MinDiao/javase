package com.hpe.day08;

import java.util.Scanner;

public class Guess {
	private int v = 100;
	public Guess() {
		
	}
	public Guess(int v) {
		this.setV(v);
	}
	public void setV(int v) {
		this.v = v;
	}
	public int getV() {
		return v;
	}
	public void show() {
		//键盘输入
		System.out.println("请输入");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//判断
		if (input > this.getV()) {
			System.out.println("猜大了");
			//递归
			this.show();
		} else if (input < this.getV()) {
			System.out.println("猜小了");
			//递归
			this.show();
		} else if(input == this.getV()) {
			System.out.println("猜测成功");
		}
	}
}
