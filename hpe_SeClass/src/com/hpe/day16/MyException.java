package com.hpe.day16;

public class MyException extends Exception {
	//无参构造方法
	public MyException() {
		
	}
	//有参构造方法
	public MyException(String e) {
		super(e);
	}
}
