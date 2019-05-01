package com.tz.integerUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientScannerRunnable implements Runnable {
	public String ip;
	public int port;
	
	public UDPClientScannerRunnable(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String message = sc.nextLine();
			if (message.equals("q")) {
				break;
			}
			try {
				DatagramSocket ds = new DatagramSocket();
				InetAddress inet = InetAddress.getByName(ip);
				byte[] date = message.getBytes();
				DatagramPacket dp = new DatagramPacket(date, date.length, inet, port);
				ds.send(dp);
				//关闭资源
				ds.close();
				ds = null;
				dp = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		sc.close();
	}
}
