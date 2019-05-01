package com.hpe.day15TCPRunnable;

import java.io.DataOutputStream;
import java.io.IOException;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
/*
 * TCP键盘传输客户端
 */
public class TestliaotianClient implements Runnable {
	//传递ip和端口
	String ip;
	int port;
	
	public TestliaotianClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("please input your message:");
			String message = sc.next();
			if(message.equals("q")){
				break;
			}
			try {
				Socket socket = new Socket(ip,port);		
				OutputStream outs = socket.getOutputStream();
				DataOutputStream douts = new DataOutputStream(outs);
				douts.writeUTF(message);	
				douts.close();
				socket.close();
				douts = null;
				socket = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		sc.close();
	}
}
