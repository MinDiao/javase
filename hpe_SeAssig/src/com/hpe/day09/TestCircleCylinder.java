package com.hpe.day09;

import java.util.Scanner;

public class TestCircleCylinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入圆的半径");
		double n1 = sc.nextDouble();
		System.out.println("请输入圆柱的高");
		double n2 = sc.nextDouble();
		Cylinder c = new Cylinder(n1, n2);
		c.show();
		c.showVolume();
	}
}
