package com.hpe.day15TCPRunnable;

public class TCPliaotianTest {

	public static void main(String[] args) {
		// 创建服务器端线程
		TestliaotianServer ts = new TestliaotianServer(3523,"127.0.0.3");
		Thread serverT = new Thread(ts);
		
		// 创建客户端线程
		TestliaotianClient tc = new TestliaotianClient("127.0.0.2",3523);
		Thread clientT = new Thread(tc);
		
		// 开启服务器线程
		serverT.start();
		
		/*先开启服务器，后开启客户端*/
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		// 开启客户端线程
		clientT.start();
	}

}
