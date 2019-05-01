package com.hpe.day17_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
 * 	序列化
 */
public class SerTest {
	public static void main(String[] args) throws IOException {
		//创建一个账号
		Count count = new Count("tom", 20000);
		count.setMoney(25000);
		//声明一个磁盘文件
		FileOutputStream fos = new FileOutputStream("t.tmp");//节点流
		ObjectOutputStream oos = new  ObjectOutputStream(fos);//处理流
		oos.writeObject(count);
		//释放资源
		oos.close();
	}
}
