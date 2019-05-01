package com.hpe.day14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 	实验任务
		三种方式读文件
	实验要求
		使用FileReader类、BufferedReader类、FileInputStream类三种方式
		从D盘下HelloWorld.java文件中读取全部信息并打印到控制台
		异常处理使用throw关键字对可能的异常进行处理，细化异常的类型
 */
public class Test05 {

	public static void main(String[] args) throws IOException {
		FR();
		BFR();
		FIS();
	}
	
	public static void FR() throws IOException {
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\HelloWorld.java");
			char[] c = new char[1024];
			int len = 0;
			while ((len = fr.read(c)) != -1);
			System.out.println(c);
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("找不到文件异常");
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				throw new IOException("关闭流失败");
			}
		}
	}
	
	public static void BFR() throws IOException {
		BufferedReader bfr = null;
		try {
			bfr = new BufferedReader(new FileReader("D:\\\\HelloWorld.java"));
			String line = null;
			while ((line = bfr.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("找不到文件异常");
		} finally {
			try {
				bfr.close();
			} catch (IOException e) {
				throw new IOException("关闭流失败");
			}
		}
	}
	
	public static void FIS() throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\HelloWorld.java");
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = fis.read(b)) != -1) {
				System.out.println(new String(b, 0, len));
			}
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("找不到文件异常");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				throw new IOException("关闭流异常");
			}
		}
		
	}

}
