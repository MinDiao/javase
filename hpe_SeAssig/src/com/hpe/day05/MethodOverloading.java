package com.hpe.day05;

public class MethodOverloading {
	public static void main(String[] args){
		
	}
	//byte
	public static boolean compare(byte a,byte b){
		System.out.print("byte ");
		return a == b;
	}

	//short
	public static boolean compare(short a,short b){
		System.out.print("short ");
		return a == b;
	}
	
	//float
	public static boolean compare(float a,float b){
		System.out.print("float ");
		return a == b;
	}

	//int
	public static boolean compare(int a,int b) {
		System.out.print("int ");
		return a == b;
	}

	//long
	public static boolean compare (long a,long b){
		System.out.print("long ");
		return a == b;
	}
}
