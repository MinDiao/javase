package com.hpe.day19_2TCP;

import java.io.DataOutputStream;
import java.io.IOException;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
/*
 * TCP键盘传输客户端
 */
public class TestClient {
	public static void main(String[] args) throws IOException {
		String ip = args[0];
		int port = Integer.parseInt(args[1]);
	
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("please input your message:");
			String message = sc.next();
			if(message.equals("q")){
				break;
			}
			
			Socket socket = new Socket(ip,port);		
			OutputStream outs = socket.getOutputStream();
			DataOutputStream douts = new DataOutputStream(outs);
			douts.writeUTF(message);	
			douts.close();
			socket.close();
			douts = null;
			socket = null;
		}			
		sc.close();
	}
}
