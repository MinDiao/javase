package com.hpe.day10;

public class ThreeFunctionTest {
	public static void main(String[] args) {
		ThreeFunction tf = new ThreeFunction(2,3);
		tf.run();
		
		ThreeFunction tf1 = new ThreeFunction(33.4,6.2,11.2);
		tf.run1();
		
		ThreeFunction tf2 = new ThreeFunction("a","b");
		tf.run2();
		
	}
}
