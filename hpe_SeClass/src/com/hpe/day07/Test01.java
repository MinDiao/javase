package com.hpe.day07;

public class Test01 {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "小明";//父类的属性
		student.sNo = "123";//子类的属性
		Student student2 = new Student();
		student2.name = "小明";
		student2.sNo = "123";
		System.out.println(student.equals(student2));
	}
}
