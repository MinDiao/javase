/**
 * 
 */
package com.life.view;

import java.util.List;
import java.util.Scanner;

import com.life.po.Ranking;
import com.life.service.IRankingService;
import com.life.service.impl.RankingServiceImpl;

/** 
 * 	类描述：娱乐天地表示层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月12日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class RankingUI {

	// 键盘输入
	private static Scanner sc = new Scanner(System.in);
	// 实现排行榜服务层
	private static IRankingService rankservice = new RankingServiceImpl();

	public static void rankingMenu(){
		while (true) {
			System.out.println("----------娱乐天地----------");
			System.out.println("---欢迎您,用户"+UsersUI.users1.getUserName()+"---");
			System.out.println("1.猜拳游戏 2.游戏排行榜  0.返回主菜单");
			System.out.println("请选择业务:");
			String input = sc.next();
			switch (input) {
				case "1":
					// 查看备忘录
					game();
					break;
	
				case "2":
					selectRank();
					// 添加备忘录
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

	// 猜拳游戏
	public static void game(){
		return;
	}

	// 查看排行榜
	public static void selectRank(){
		// 查询结果
		List<Ranking> list = rankservice.selectRank();
		// 遍历结果
		for (Ranking ranking : list) {
			System.out.println(ranking);
		}
		return;
	}

}
