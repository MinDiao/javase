package com.hpe.day13;

public class NBAStatistics {
	public static void main(String[] args) {
		String father = "nbaernbatynbauinbaopnba";
		String child = "nba";
		//计次
		int count = 0;
		//子字符串不高于父字符串
		while(child.length() <= father.length()) {
			//字符串在父字符串索引中不为-1
			if (father.indexOf(child) != -1) {
				father = father.substring(father.indexOf(child) + child.length(), father.length());
				count++;
			} else {
				break;
			}
		}
		System.out.println("出现了"+ count +"次");
	}
}
