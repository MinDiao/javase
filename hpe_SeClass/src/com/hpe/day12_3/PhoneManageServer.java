package com.hpe.day12_3;

import java.util.Scanner;

public class PhoneManageServer {
	String name;
	String sex;
	String age;
	String telnum;
	String qq;
	String address;
	
	public PhoneManageServer(String name, String sex, String age, String telnum, String qq, String address) { 
		this.name = name; 
		this.sex = sex; 
		this.age = age; 
		this.telnum = telnum; 
		this.qq = qq; 
		this.address = address; 
	} 

	@Override
	public String toString() {
		return "name=" + name + ", sex=" + sex + ", age=" + age + ", telnum=" + telnum + ", qq=" + qq
				+ ", address=" + address;
	}
	
	
}
