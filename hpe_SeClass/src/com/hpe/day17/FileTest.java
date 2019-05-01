package com.hpe.day17;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("b");//当前工程目录下找
		//检查文件是否存在
		if (file.exists()) {
			System.out.println("存在");
//			System.out.println("文件名字："+ file.getName());
//			System.out.println("文件路径："+ file.getParent());
//			System.out.println("文件的绝对文件"+ file.getAbsoluteFile());
//			System.out.println("文件的绝对路径"+ file.getAbsolutePath());
//			System.out.println("文件的父路径"+ file.getParent());
//			System.out.println("文件的大小"+ file.length());
//			System.out.println("最后修改时间"+ new Date(file.lastModified()));
			//file.delete();
			File[] files = file.listFiles();
			for(File s : files) {
				System.out.println(s);
			}
			if (file.isFile()) {
				System.out.println("是文件");
			} 
			if (file.isDirectory()){
				System.out.println("是文件夹");
			}
		} else {
			System.out.println("不存在");
			//file.createNewFile();
			//file.mkdirs();
			
		}
	}

}
