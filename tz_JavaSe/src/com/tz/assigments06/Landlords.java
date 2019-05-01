package com.tz.assigments06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Landlords {
	public static void main(String[] args) {
		// 创建HashMap集合
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
 
		// 创建一个ArrayList集合
		ArrayList<Integer> array = new ArrayList<Integer>();
 
		// 创建花生数组和点色数组
		String[] colors = { "♠", "♥", "♣", "♦" };
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "K",
				"Q", "A", "2" };
 
		// 从0开始往HashMap里面存储编号,并存储对应的牌,同时往ArrayList里面存储编号即可
		int index = 0;
 
		for (String number : numbers) {
			for (String color : colors) {
				String poke = color.concat(number);
				hm.put(index, poke);
				array.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		array.add(index);
		index++;
		hm.put(index, "大王");
		array.add(index);
 
		// 洗牌(洗的是编号)
		Collections.shuffle(array);
 
		// 发牌(发的也是编号,为了保证编号是排序的,就创建TreeSet集合接收)
		TreeSet<Integer> fengQingYang = new TreeSet<Integer>();
		TreeSet<Integer> linQingXia = new TreeSet<Integer>();
		TreeSet<Integer> liGang = new TreeSet<Integer>();
		TreeSet<Integer> diPai = new TreeSet<Integer>();
 
		for (int x = 0; x < array.size(); x++) {
			// 5个人发牌就把3改成5
			if (x >= array.size() - 3) {
				diPai.add(array.get(x));
			} else if (x % 3 == 0) {
				fengQingYang.add(array.get(x));
			} else if (x % 3 == 1) {
				linQingXia.add(array.get(x));
			} else if (x % 3 == 2) {
				liGang.add(array.get(x));
			}
		}
 
		// 看牌(遍历TreeSet集合,获取编号,到HashMap集合找对应的牌
		lookPoker("玩家1", fengQingYang, hm);
		lookPoker("玩家2", linQingXia, hm);
		lookPoker("玩家3", liGang, hm);
		lookPoker("玩家4", diPai, hm);
		// System.out.println(hm.size() + "---" + hm);
	}
 
	// 看牌的功能
	public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
		System.out.print(name + "的牌是:");
		for (Integer key : ts) {
			String value = hm.get(key);
			System.out.print(value + " ");
		}
		System.out.println();
	}

}
