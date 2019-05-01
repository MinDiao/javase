package com.tz.integerTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
/*
 * TCP数据交换客户端
 */
public class TCPClientDataBack {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 创建一个Socket对象，连接到服务器
		Socket socket = new Socket("127.0.0.1", 6000);
		// 通过客户端的套接字对象Socket方法，获取字节输出流，将数据写向服务器
		OutputStream out = socket.getOutputStream();
		out.write("ok".getBytes());
		
		//读取服务器发回的数据，使用Socket套接字对象，获取字节输入流
		InputStream in = socket.getInputStream();
		byte[] date = new byte[1024];
		int len = in.read(date);
		System.out.println(new String(date, 0, len));
		
		//关闭资源
		socket.close();
	}

}
