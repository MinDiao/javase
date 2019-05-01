package com.tz.assigments06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Landlords02 {
	public static void main(String[] args) {
		//组合牌
		HashMap<Integer, String> pooker = new HashMap<Integer, String>();
		//创建一个list集合，存放编号
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//定义13个点数
		String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		//定义4个花色
		String[] colors = {"♠", "♥", "♣", "♦"};
		
		//定义键，遍历数组，花色+点数的组合，存到map中
		int index = 2;
		for (String number : numbers) {
			for (String color : colors) {
				pooker.put(index, color+number);
				arrayList.add(index);//存放编号
				index++;
			}
		}
		//System.out.println(pooker);
		
		//存储大王和小王
		pooker.put(0,"大王");
		arrayList.add(0);
		pooker.put(1, "小王");
		arrayList.add(1);
		
		//洗牌
		Collections.shuffle(arrayList);
		
		//发牌
		ArrayList<Integer> plays1 = new ArrayList<Integer>();
		ArrayList<Integer> plays2 = new ArrayList<Integer>();
		ArrayList<Integer> plays3 = new ArrayList<Integer>();
		ArrayList<Integer> bottom = new ArrayList<Integer>();//底牌
		//循环发牌:每个人抓一张牌
		for (int i = 0; i < arrayList.size(); i++) {
			//先存底牌
			if (i < 3) {
				bottom.add(arrayList.get(i));
			}
			if (i % 3 == 0) {
				//玩家1
				plays1.add(arrayList.get(i));
			} else if (i % 3 == 1) {
				//玩家2
				plays2.add(arrayList.get(i));
			} else if (i % 3 == 2) {
				//玩家3
				plays3.add(arrayList.get(i));
			}
		}
		//将玩家手中的牌进行排序
		Collections.sort(plays1);
		Collections.sort(plays2);
		Collections.sort(plays3);
		Collections.sort(bottom);
		
		//看牌
		look("玩家1", plays1, pooker);
		look("玩家2", plays2, pooker);
		look("玩家3", plays3, pooker);
		look("底牌", bottom, pooker);
	}
	//看牌的方法封装
	public static void look(String name, ArrayList<Integer> plays, HashMap<Integer, String> pooker) {
		System.out.print(name +": ");
		for (Integer play : plays) {
			String value = pooker.get(play);
			System.out.print(value +" ");
		}
		System.out.println();
	}
}











