package com.hpe.day17_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/*
 * 	反序列化
 */
public class SerTest2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Count count = (Count)ois.readObject(); 
        System.out.println(count.getMoney());
        //释放资源
        ois.close();
	}
}
