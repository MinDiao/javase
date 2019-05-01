package com.hpe.day14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 	实验任务
		使用字符流的方式实现文件的复制
	
	实验要求
		将D盘中的HelloWorld.java文件使用字符流的方式复制到D盘下HelloWorld.bak文件
		异常处理使用throws关键字
 */
public class Test04 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\HelloWorld.java");
		FileWriter fw = new FileWriter("D:\\HelloWorld.bak");
		char[] c = new char[1024];
		int len = 0;
		while ((len = fr.read(c)) != -1) {
			fw.write(c, 0, len);
			fw.flush();
		}
		fr.close();
		fw.close();

	}

}
