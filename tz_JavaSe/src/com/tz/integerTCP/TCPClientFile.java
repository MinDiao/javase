package com.tz.integerTCP;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP图片上传客户端
 */
public class TCPClientFile {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 6000);
		// 获取字节输出流,图片写到服务器
		OutputStream out = socket.getOutputStream();
		// 创建字节输入流,读取本机上的数据源的图片
		FileInputStream fis = new FileInputStream("d:\\t.jpg");
		// 开始读写字节数组
		int len = 0;
		byte[] bytes = new byte[1024];
		while ((len = fis.read(bytes)) != -1) {
			out.write(bytes, 0, len);
		}
		// 给服务器写一个终止序列,解决线程阻塞问题
		socket.shutdownInput();
		
		// 获取字节输入流,读取服务器的上传成功
		InputStream in = socket.getInputStream();
		len = in.read(bytes);
		System.out.println(new String(bytes, 0, len));
		
		// 关闭资源
		fis.close();
		socket.close();
	}

}
