package com.hpe.day13;

public class CloneTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Clone c = new Clone();
		c.number = 10;
		c.obt2.name = "张三";
		//调用克隆方法
		Clone c2 = (Clone)c.clone();
		
		System.out.println(c.obt2.name);
		c.obt2.name = "李四";
		System.out.println(c.obt2.name);
	}
	
}
