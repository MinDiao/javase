package com.tz.integerTCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
/*
 * TCP简单程序客户端
 */
public class TCPClientEasy {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 6000);
		OutputStream out = socket.getOutputStream();
		out.write("ok".getBytes());
		socket.close();
		
	}

}
