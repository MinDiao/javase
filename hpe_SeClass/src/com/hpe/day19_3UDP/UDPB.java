package com.hpe.day19_3UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*UDP接收端*/
public class UDPB {

	public static void main(String[] args) throws IOException {
		byte[] bs = new byte[500];
		DatagramPacket p=new DatagramPacket(bs, bs.length);
		DatagramSocket socket_B=new DatagramSocket(10010);
		socket_B.receive(p);
		System.out.println(new String(bs,0,p.getLength()));
		socket_B.close();
		
	}
}
