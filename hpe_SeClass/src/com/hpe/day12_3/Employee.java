package com.hpe.day12_3;

public class Employee extends Role {
	//增加一个final成员常量id
	public final String ID;
	
	//增加一个静态成员变量company
	public static String company;
	
	//增加了普通成员变量salary
	public double salary;
	
	
	public Employee() {
		this.ID = "001";
	}
	public Employee(String ID) {
		this.ID = ID;
	}
	public Employee(String name, int age, String sex) {
		super(name,age,sex);
		this.ID = "001";
	}
	public Employee(String name, int age, String sex, String ID, String company, double salary) {
		this(ID);
		this.company = company;
		this.salary = salary;
	}
	
	
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Employee.company = company;
	}
	
	@Override
	public void play() {
		super.say();
	}

}
