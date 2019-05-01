package com.tz.integerTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * TCP数据交换服务器
 */
public class TCPServerDataBack {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(6000);
		//调用服务器套接字对象中的方法accept()获取客户端套接字对象
		Socket socket =server.accept();
		System.out.println(socket);
		
		//通过客户端套接字对象,socket获取字节输入流，读取的是客户端发来的数据
		InputStream in = socket.getInputStream();
		byte[] date = new byte[1024];
		int len = in.read(date);
		System.out.println(new String(date, 0, len));
		
		//服务器向客户端返回数据，直接输出流，通过客户端的套接字对象获取字节输出流
		OutputStream out = socket.getOutputStream();
		out.write("以收到".getBytes());
		
		//关闭资源
		socket.close();
		server.close();
	}

}
