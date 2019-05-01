package com.tz.integerTCP;
/*
 * TCP键盘聊天测试类
 */
public class TCPSacnnerRunnableTest {

	public static void main(String[] args) {
		TCPServerSacnnerRunnable ts = new TCPServerSacnnerRunnable(6000,"127.0.0.1");
		Thread server = new Thread(ts);
		
		TCPClientSacnnerRunnable tc = new TCPClientSacnnerRunnable("127.0.0.1",6000);
		Thread client = new Thread(tc);
		
		server.start();
		
		// 先启动服务端,再启动客户端
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		client.start();
	}
}
