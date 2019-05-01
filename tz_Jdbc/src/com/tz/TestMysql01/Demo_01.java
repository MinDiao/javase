package com.tz.TestMysql01;
/*
 * 增
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC的开发步骤
 * 1.注册驱动
 * 2.获得连接
 * 3.获得语句执行平台
 * 4.执行SQL语句
 * 5.处理结果
 * 6.释放资源
 */
public class Demo_01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * 1.注册驱动
		 * static void registerDriver(Driver driver)
		 * 向DriverManager 注册给定驱动程序.静态方法Diver是接口,传递参数,MySQL驱动程序的实现类
		 * 
		 * static{
		 * 	DriverManager.registerDriver(new Driver());
		 */
		//DriverManager.registerDriver(new Driver()); //不用此方法,因为有static驱动被注册两次
		
		//则使用反射的方式
		Class.forName("com.mysql.jdbc.Driver");
		
		/*
		 * 2.获得连接
		 * static Connection getConnection(String url, String user, String password)
		 * 试图建立到给定数据库URL的连接
		 * 返回值Connection类接口的实现类
		 * String url数据库地址 jdbc:mysql://连接主机ip:端口号//数据库名字
		 * String user名称
		 * String password 密码
		 */
		String url = "jdbc:mysql://localhost:3306/ljr";
		String user = "root";
		String password = "123456";
		Connection con = DriverManager.getConnection(url, user, password);
		//System.out.println(con);
		
		/*
		 * 3.获得语句执行平台
		 * 通过数据库对象,获得SQL语句执行者对象
		 * Connection调用方法 Statement接口的实现类对象 createStatement()获取对象,将SQL语句发送给数据库
		 * 返回值是statement接口实现类对象
		 */
		Statement stat = con.createStatement();
			
		/*
		 * 4.执行SQL语句
		 * executeUpdate(String sql) 执行insert delete update
		 * executeQuery(String sql) 执行select
		 */
		int row = stat.executeUpdate("INSERT INTO SORT(SNAME,SPRICE) VALUES('汽车用品',2000)");
		//System.out.println(row); 操作成功数据表多少行
		
		/*
		 * 6.释放资源 close()关闭
		 */
		stat.close();
		con.close();
	}
}
