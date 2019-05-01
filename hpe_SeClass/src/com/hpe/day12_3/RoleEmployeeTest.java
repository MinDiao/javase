package com.hpe.day12_3;

public class RoleEmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		Employee.company = "阿里巴巴";
		e1.play();
		e2.sing();
	}
}
