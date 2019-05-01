package com.tz.integerTCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * TCP键盘聊天客户端
 */
public class TCPClientSacnner {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		// 创建Socket套接字对象 连接服务器
		Socket socket = new Socket("127.0.0.1",6000);
		
		while (true) {
			String message = sc.nextLine();
			if (message.endsWith("q")) {
				break;
			}
			// 通过客户端套接字对象创建字节输出流,发送到服务器
			OutputStream out = socket.getOutputStream();
			out.write(message.getBytes());
			
			//关闭资源
			socket.close();
			socket = null;
		}
		sc.close();
		
	}

}
