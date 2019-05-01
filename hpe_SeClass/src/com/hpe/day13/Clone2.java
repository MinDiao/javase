package com.hpe.day13;

public class Clone2 implements Cloneable {//实现接口，使克隆合法
	String name;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
