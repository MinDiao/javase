package com.tz.integerTCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * TCP键盘聊天客户端
 */
public class TCPClientSacnnerRunnable implements Runnable {
	public String ip;
	public int port;
	
	public TCPClientSacnnerRunnable(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		// 创建Socket套接字对象 连接服务器
		Socket socket = null;
		
		while (true) {
			String message = sc.nextLine();
			if (message.endsWith("q")) {
				break;
			}
			try {
				socket = new Socket(ip,port);
				// 通过客户端套接字对象创建字节输出流,发送到服务器
				OutputStream out = socket.getOutputStream();
				out.write(message.getBytes());
				
				//关闭资源
				out.close();
				out = null;
				socket.close();
				socket = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		sc.close();
	}
}
