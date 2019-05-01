/**
 * 
 */
package com.life.view;

import java.util.Scanner;

import com.life.dao.IUsersDao;
import com.life.dao.impl.UsersDaoImpl;
import com.life.po.Users;
import com.life.service.IUsersService;
import com.life.service.impl.UsersServiceImpl;

/** 
 * 	类描述：用户信息修改表示层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月10日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class UserInformationUI {

	// 键盘输入
	private static Scanner sc = new Scanner(System.in);
	// 实现用户服务层
	private static IUsersService userservice = new UsersServiceImpl();
	// 实现用户数据逻辑层
	private static IUsersDao userdao = new UsersDaoImpl();
	// 初始化实体类创建实体类的成员变量,用户接收方法执行的参数
	private static Users users1 = new Users();

	// 信息维护
	public static void updateTelAddress(){
		
		System.out.println("----------个人生活助手平台----------");
		System.out.println("----------信息维护----------");
		// 输出修改前该登录的用户信息
		System.out.println(UsersUI.users1);
		System.out.println("请输入手机号:");
		String tel = sc.next();
		System.out.println("请输入地址:");
		String address = sc.next();
		// 实例化实体类,并传递属性
		Users users = new Users();
		users.setTel(tel);
		users.setAddress(address);
		// 设置执行行数
		int result = userservice.updateTelAddress(users, UsersUI.users1.getUserName());
		if (result > 0) {
			// 更新临时对象
			users1 = users;
			System.out.println("更新成功");
			System.out.println(users1);
			return;
		} else {
			System.out.println("更新失败");
		}
	}
	
	// 密码修改
	public static void updatePassword(){
		// 初始化密码输入错误次数
		int pswCount = 3;
		
		while (true) {
			System.out.println("----------个人生活助手平台----------");
			System.out.println("----------密码修改----------");
			System.out.println("请输入原密码:");
			String oldPsw = sc.next();
			System.out.println("请输入新密码:");
			String newPsw = sc.next();
			System.out.println("请再次输入新密码:");
			String newPswAgain = sc.next();
			// 实例化实体类
			Users users = new Users();
			// 判断该用户密码与输入原密码是否相等
			if (oldPsw.equals(userdao.selectUsersName(UsersUI.users1.getUserName()).getUserPassword())) {
				// 判断第一次与第二次输入的密码是否一致
				if (newPsw.equals(newPswAgain)) {
					// 为实体类传递属性
					users.setUserPassword(newPswAgain);
					// 执行修改密码
					userservice.updatePassword(users, UsersUI.users1.getUserName());
					System.out.println("密码修改成功");
					return;
				} else {
					if (--pswCount > 0) {
						System.err.println("用户名或密码错误,还有"+(pswCount)+"次机会");
					} else {
						System.out.println("密码修改失败,请重新选择");
						return;
					}
				}
			} else {
				System.err.println("您输入的原密码不正确");
				return;
			}
		}
	}

}
