package com.zw.po;
/*
 * 学生实体类和数据库student中stu表对应
 */
public class Student {
	private int stuid;
	private String stuname;
	private int age;
	private String address;
	
	public Student() {//此项目不可以缺少无参构造方法
		super();
	}
	public Student(int stuid, String stuname, int age, String address) {
		this.stuid = stuid;//不可以缺少this关键字，this代表当前对象
		this.stuname = stuname;//this为了避免与构造器传的参发生重复
		this.age = age;
		this.address = address;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", age=" + age + ", address=" + address + "]";
	}
	
}
