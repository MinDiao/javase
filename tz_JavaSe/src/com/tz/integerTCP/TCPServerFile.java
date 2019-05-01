package com.tz.integerTCP;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP图片上传服务器
 */
public class TCPServerFile {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(6000);
		Socket socket = server.accept();
		// 通过客户端连接对象获取字节输入流,读取客户端发来的图片
		InputStream in = socket.getInputStream();
		File upload = new File("d:\\upload");
		if (!upload.exists()) {
			upload.mkdirs();
		}
		
		// 创建字节输出流,将图片写入到目的文件夹中
		FileOutputStream fos = new FileOutputStream(upload+"\\t.jpg");
		
		// 读写字节数组,通过客户端连接对象,获取字节输出流
		int len = 0;
		byte[] bytes = new byte[1024];
		while ((len = in.read(bytes)) != -1) {
			fos.write(bytes, 0, len);
		}
		
		// 上传成功,写回到客户端
		OutputStream ops = socket.getOutputStream();
		ops.write("上传成功".getBytes());
		
		// 关闭资源
		fos.close();
		socket.close();
		server.close();
	}

}
