package com.tz.integerTCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP键盘聊天服务端
 */
public class TCPServerSacnner {

	public static void main(String[] args) throws IOException {
		// 创建服务端Socket对象
		ServerSocket server = new ServerSocket(6000);
		
		while (true) {
			// 创建服务端Socket套接字对象中的accept方法,获取客户端套接字对象
			Socket socket = server.accept();
			// 通过服务端Socket对象创建字节输入流,接受客户端发来数据
			InputStream in = socket.getInputStream();
			byte[] date = new byte[1024];
			int len = in.read(date);
			System.out.println(new String(date,0,len));
			
			// 关闭资源
			socket.close();
			socket = null;
		}
	}

}
