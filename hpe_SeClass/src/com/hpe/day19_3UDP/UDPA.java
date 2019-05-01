package com.hpe.day19_3UDP;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*发信息*/
public class UDPA {

	public static void main(String[] args) throws IOException {
		byte[] bs = "我是A,gei B fa xinxi".getBytes();
		InetAddress desIP = InetAddress.getLocalHost();
		DatagramPacket p = new DatagramPacket(bs, bs.length,desIP, 10010);
		DatagramSocket socket_A = new DatagramSocket(10086);
		socket_A.send(p);
		socket_A.close();
	}

}
