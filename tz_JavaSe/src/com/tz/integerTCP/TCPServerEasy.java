package com.tz.integerTCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * TCP简单程序服务器
 */
public class TCPServerEasy {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(6000);
		Socket socket = server.accept();
		System.out.println(socket);
		InputStream in = socket.getInputStream();
		byte[] date = new byte[1024];
		int len = in.read(date);
		System.out.println(new String(date, 0, len));
		socket.close();
		server.close();
	}

}
