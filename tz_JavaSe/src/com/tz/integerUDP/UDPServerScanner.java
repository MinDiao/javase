package com.tz.integerUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerScanner {

	public static void main(String[] args) throws IOException{
		DatagramSocket ds = new DatagramSocket(6000);
		byte[] date = new byte[1024];
		while (true) {
			DatagramPacket dp = new DatagramPacket(date, date.length);
			ds.receive(dp);
			String ip = dp.getAddress().getHostAddress();
			int port = dp.getPort();
			int leng = dp.getLength();
			System.out.println(new String(date, 0, leng)+"..."+ip+"..."+leng);
		}

	}

}
