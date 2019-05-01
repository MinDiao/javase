package com.tz.integerUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {

	public static void main(String[] args) throws IOException {
		byte[] date = "你好".getBytes();
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(date, date.length, inet, 6000);
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		ds.close();

	}

}
