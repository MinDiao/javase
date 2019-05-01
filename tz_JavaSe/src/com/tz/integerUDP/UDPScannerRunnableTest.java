package com.tz.integerUDP;

public class UDPScannerRunnableTest {

	public static void main(String[] args) {
		UDPServerScannerRunnable us = new UDPServerScannerRunnable(3532);
		Thread server = new Thread(us);
		
		UDPClientScannerRunnable uc = new UDPClientScannerRunnable("127.0.0.2", 3532);
		Thread client = new Thread(uc);
		
		//启动服务端
		server.start();
		
		//先启动服务端
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//启动客户端
		client.start();
	}
}
