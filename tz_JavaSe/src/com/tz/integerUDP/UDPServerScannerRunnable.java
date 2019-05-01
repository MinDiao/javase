package com.tz.integerUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServerScannerRunnable implements Runnable {
	public int port;
	
	public UDPServerScannerRunnable(int port) {
		this.port = port;
	}

	@Override
	public void run() {
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(port);
		} catch (SocketException e1) {
			e1.printStackTrace();
		}
		while (true) {
			try {
				byte[] date = new byte[1024];
				DatagramPacket dp = new DatagramPacket(date, date.length);
				ds.receive(dp);
				
				//获取地址
				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				int leng = dp.getLength();
				System.out.println(new String(date, 0, leng)+"\t"+ip+"\t"+port);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
