/**
 * 
 */
package com.life.view;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.life.dao.IMemoDao;
import com.life.dao.IUsersDao;
import com.life.dao.impl.MemoDaoImpl;
import com.life.dao.impl.UsersDaoImpl;
import com.life.po.Memo;
import com.life.service.IMemoService;
import com.life.service.impl.MemoServiceImpl;

/** 
 * 	类描述：备忘录表示层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月11日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class MemoUI {
	
	// 键盘输入
	private static Scanner sc = new Scanner(System.in);
	// 实现用户数据逻辑层
	private static IUsersDao userdao = new UsersDaoImpl();
	// 实现备忘录服务层
	private static IMemoService memoservice = new MemoServiceImpl();
	// 实现备忘录持久化层
	private static IMemoDao memodao = new MemoDaoImpl();
	
	public static void MemorandumMenu(){
		while (true) {
			System.out.println("----------个人生活助手平台----------");
			System.out.println("---欢迎您,用户"+UsersUI.users1.getUserName()+"上次登录时间:"+userdao.selectUsersName(UsersUI.users1.getUserName()).getLogin_time()+"---");
			System.out.println("1.查看备忘录 2.添加备忘录 3.修改备忘录 4.删除备忘录 0.返回主菜单");
			System.out.println("请选择业务:");
			String input = sc.next();
			switch (input) {
				case "1":
					// 查看备忘录
					selectUserId();
					break;
					
				case "2":
					insertMemo();
					// 添加备忘录
					break;
					
				case "3":
					updateMemo();
					// 修改备忘录
					break;
					
				case "4":
					// 删除备忘录
					deleteMemo();
					break;
					
				case "0":
					// 返回主菜单
					return;
	
				default:
					System.out.println("输入有误");
					break;
			}
		}
	}
	
	// 查看备忘录
	public static void selectUserId(){
		System.out.println("----------我的备忘录----------");
		System.out.println("----------查看备忘录----------");
		// 实例化备忘录实体类
		Memo memo = new Memo();
		// 给备忘录实体类赋用户id的属性
		memo.setUserId(UsersUI.users1.getUserId());
		// 执行查询方法
		List<Memo> list = memoservice.selectMemo(memo);
		// 遍历备忘录信息
		for (Memo memo2 : list) {
			System.out.println(memo2);
		}
		return;
	}
	
	// 添加备忘录
	public static void insertMemo(){
		System.out.println("----------我的备忘录----------");
		System.out.println("----------添加备忘录----------");
		System.out.println("请输入标题:");
		String title = sc.next();
		System.out.println("请输入内容:");
		String content = sc.next();
		// 实例化备忘录实体类并赋值
		Memo memo = new Memo(title, new Date(), content, UsersUI.users1.getUserId());
		// 执行并返回影响行数
		int result = memoservice.insertMemo(memo);
		if (result > 0) {
			System.out.println("你的备忘录添加成功,请注意查看");
			return;
		} else {
			System.out.println("备忘录添加失败");
			return;
		}
	}
	
	// 修改备忘录
	public static void updateMemo(){
		System.out.println("----------我的备忘录----------");
		System.out.println("----------修改备忘录----------");
		System.out.println("请输入要修改的备忘录编号:");
		int mid = sc.nextInt();
		// 查询要修改的旧备忘录信息
		Memo memo1 = memodao.selectMemoMid(mid);
		// 判断是否为空
		if (memo1 == null) {
			System.out.println("您输入的编号不存在");
			return;
		} else {
			// 输出要修改的旧信息
			System.out.println(memo1);
			// 输入修改内容
			System.out.println("请输入标题:");
			String title = sc.next();
			System.out.println("请输入内容");
			String content = sc.next();
			// 实例化实体类
			Memo memo = new Memo(mid, title, content);
			// 执行结果
			int result = memoservice.updateMemo(memo, mid);
			// 判断是否执行成功
			if (result == -1) {
				System.out.println("编号不存在");
			} else if (result > 0) {
				System.out.println("备忘录修改成功");
			} else {
				System.out.println("备忘录修改失败");
			}
			return;
		}
	}
	
	// 删除备忘录
	public static void deleteMemo(){
		System.out.println("----------我的备忘录----------");
		System.out.println("----------删除备忘录----------");
		System.out.println("请输入要删除的备忘录编号:");
		int mid = sc.nextInt();
		// 查询将要删除备忘录信息
		Memo memo1 = memodao.selectMemoMid(mid);
		// 判断是否为空
		if (memo1 == null) {
			System.out.println("您输入的编号不存在");
			return;
		} else {
			// 输出将要删除的备忘录信息
			System.out.println(memo1);
			System.out.println("您确定要删除吗:(y)确定(n)不删除");
			String onoff = sc.next();
			if (onoff.equals("y")) {
				// 设置删除执行结果
				int result = memoservice.delete(mid);
				// 判断删除执行结果
				if (result == -1) {
					System.out.println("您选择的备忘录不存在");
				} else if(result > 0) {
					System.out.println("备忘录删除成功");
				} else {
					System.out.println("删除失败");
				}
			} else {
				return;
			}
		}
	}

}
