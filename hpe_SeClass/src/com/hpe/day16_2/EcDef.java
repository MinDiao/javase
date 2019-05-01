package com.hpe.day16_2;
public class EcDef extends Exception {
	public EcDef() {
		super("the args < 0");
	}
	public EcDef(String e) {
		super(e);
	}
}
