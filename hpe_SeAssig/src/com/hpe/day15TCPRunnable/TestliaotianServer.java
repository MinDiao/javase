package com.hpe.day15TCPRunnable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * TCP键盘传输服务端
 */
public class TestliaotianServer implements Runnable {
	//传递端口
	int port;
	String clientIP;
	
	public TestliaotianServer(int port, String clientIP) {
		this.port = port;
		this.clientIP = clientIP;
	}

	public void run() {
		Socket socket = null;
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(port);
			System.out.println("the server port is "+ port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while (true) {
			try {
				socket = server.accept();

				/*获取客户端的IP地址*/
				InetAddress ia = socket.getInetAddress();
				System.out.println(ia.getHostAddress());
				
				/*过滤IP地址*/
				if (clientIP.equals(ia.getHostAddress())) {
					InputStream ins = socket.getInputStream();
					DataInputStream dins = new DataInputStream(ins);
					String content = dins.readUTF();
					System.out.println(content);
					ins.close();
				}
				
				//server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
