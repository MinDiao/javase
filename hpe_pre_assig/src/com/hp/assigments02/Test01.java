package com.hp.assigments02;

public class Test01 {
	public static void main(String[] args){
		
		int day=1;
		for(double i=2.5;i<=100;i+=2.5){
			day++;
			if(day % 5 == 0){
				i-= 6;
			}
			
		}
		System.out.println(day);
		
	}
}
