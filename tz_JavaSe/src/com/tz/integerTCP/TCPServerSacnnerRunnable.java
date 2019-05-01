package com.tz.integerTCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP键盘聊天服务端
 */
public class TCPServerSacnnerRunnable implements Runnable {
	public int port;
	public String clientIP;
	
	public TCPServerSacnnerRunnable(int port, String clientIP) {
		this.port = port;
		this.clientIP = clientIP;
	}

	@Override
	public void run() {
		// 创建服务端Socket对象
		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Socket socket = null;
		
		while (true) {
			try {
				// 创建服务端Socket套接字对象中的accept方法,获取客户端套接字对象
				socket = server.accept();
				
				// 获取黑名单的IP地址
				InetAddress inet = socket.getInetAddress();
				String s = inet.getHostAddress();
				// 相同才可以进行数据传输
				if (clientIP.equals(s)) {
					// 通过服务端Socket对象创建字节输入流,接受客户端发来数据
					InputStream in = socket.getInputStream();
					byte[] date = new byte[1024];
					int len = in.read(date);
					System.out.println(new String(date,0,len));
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
