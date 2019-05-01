package com.hpe.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/*
 * 	实验任务
		掌握字节流的文件读取
	实验要求
		在D盘目录下创建HelloWorld.java
		使用字节流的方式进行文件的读取并打印至控制台
		计算所读取到的字节数，并在控制台打印
 */
public class Test01 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\HelloWorld.java");
		FileInputStream fis = new FileInputStream(file);
		int len = 0;
		while ((len = fis.read()) != -1) {
			System.out.println((char)len);
		}
		System.out.println(file.length());
		fis.close();
	}

}
