package com.hpe.day14;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 	实验任务
		三种方式写文件
	实验要求
		使用PrintWriter类、BufferedWriter类、FileOutputStream类三种方式
		用这三种方式分别将字符串“ABCDEFG”写入到D盘下HelloWorld1.txt、 HelloWorld2.txt、 HelloWorld3.txt文件中
		异常处理使用throws关键字，细化异常的类型
 */
public class Test06 {

	public static void main(String[] args) throws IOException {
		String s = "ABCDEFG";
		PW(s);
		BFW(s);
		FOS(s);
	}
	
	public static void PW(String s) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("D:\\HelloWorld1.txt"));
		char[] c = s.toCharArray();
		pw.write(c);
		pw.close();
	}
	
	public static void BFW(String s) throws IOException {
		BufferedWriter bfw = new BufferedWriter(new FileWriter("D:\\HelloWorld2.txt"));
		char[] c = s.toCharArray();
		bfw.write(c);
		bfw.close();
	}
	
	public static void FOS(String s) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\HelloWorld3.txt");
		byte[] b = s.getBytes();
		fos.write(b);
		fos.close();
	}

}
