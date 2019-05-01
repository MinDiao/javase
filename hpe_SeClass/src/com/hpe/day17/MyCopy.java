package com.hpe.day17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 	使用字符流完成：aa.txt文件的复制，复制后的文件为ff.txt
 */
public class MyCopy {
	
	public static void main(String[] args) throws IOException {
		//一、判断ff.txt是否存在，无论如何都创建一个新的文件，等待复制
		File ff = new File("ff.txt");
		if (ff.exists()) {
			ff.delete();
		}
		//创建出一个干净的ff文件
		ff.createNewFile();
		
		//二、取aa.txt中的数据，写入到ff.txt中，这样就完成整改复制过程
		FileReader fr = new FileReader("aa.txt");
		FileWriter fw = new FileWriter("ff.txt");
		int a = 0;
		while ((a = fr.read()) != -1) {
			//System.out.println((char)a);
			fw.write(a);
		}
		
		//IO流都是资源，使用完毕需要关闭
		fr.close();
		fw.close();
	}
	
}
