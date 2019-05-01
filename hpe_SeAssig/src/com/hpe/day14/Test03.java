package com.hpe.day14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 	实验任务
		掌握字符流的文件读取
	实验要求
		使用字符流的方式进行文件HelloWorld.java的读取并打印至控制台
 */
public class Test03 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\HelloWorld.java");
		char[] c = new char[1024];
		int len = 0;
		while ((len = fr.read(c)) != -1) {
			System.out.println(c);
		}
		fr.close();
	}

}
