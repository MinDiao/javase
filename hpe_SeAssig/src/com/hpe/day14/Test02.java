package com.hpe.day14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	实验任务
		使用字节流的方式实现文件的复制
	实验要求
		将D盘中的HelloWorld.java文件使用字节流的方式复制到D盘下HW.java文件
 */
public class Test02 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\HelloWorld.java");
		FileOutputStream fos = new FileOutputStream("D:\\HW.java");
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes, 0, len);
		}
		fis.close();
		fos.close();
	}

}
