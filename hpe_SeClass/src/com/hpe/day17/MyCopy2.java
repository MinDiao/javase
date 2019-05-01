package com.hpe.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	使用字节流完成：aa.txt文件的复制，复制后的文件为ff.txt
 */
public class MyCopy2 {

	public static void main(String[] args) throws IOException {
		//一、判断ff.txt是否存在，无论如何都创建一个新的文件，等待复制
		File ff = new File("ff.txt");
		if (ff.exists()) {
			ff.delete();
		}
		//创建出一个干净的ff文件
		ff.createNewFile();
		
		//二、取aa.txt中的数据，写入到ff.txt中，这样就完成整改复制过程
		FileInputStream fi = new FileInputStream("aa.txt");
		FileOutputStream fo = new FileOutputStream("ff.txt");
		byte buf[] =  new byte[1024];
		int len = 0;
		while ((len = fi.read(buf)) != -1) {
			fo.write(buf, 0 ,len);
		}
		//三、释放资源
		fi.close();
		fo.close();
	}

}
