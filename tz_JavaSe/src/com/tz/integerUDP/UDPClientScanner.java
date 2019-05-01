package com.tz.integerUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientScanner {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		DatagramSocket ds = new DatagramSocket();
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		while (true) {
			String message = sc.nextLine();
			byte[] date = message.getBytes();
			DatagramPacket dp = new DatagramPacket(date, date.length, inet, 6000);
			ds.send(dp);
		}
		
	}

}
