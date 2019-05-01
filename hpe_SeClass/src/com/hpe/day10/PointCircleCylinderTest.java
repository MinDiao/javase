package com.hpe.day10;

import java.util.Scanner;

public class PointCircleCylinderTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入4个值");
		
		Cylinder cy = new Cylinder(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		cy.area();
		cy.volume();
	}
}
