package com.tz.KnowledgePoint;
/*
 * 	冒泡排序法: 思路一
 */
public class BubbleSort01 {
	public static void main(String[] args) {
		int score[] = {42,12,65,85,25,32,42,54,65,32,13}; //静态初始化
		for (int i = 1; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i] < score[j]) { //交换位置
					int temp = score[i]; //中间变量
					score[i] = score[j]; 
					score[j] = temp;
				}
			}
		}
		int e = 0;
		for (int i : score) { //遍历输出
			e++;
			if (e == score.length) {
				System.out.print(i);
			} else {
				System.out.print(i +",");
			}
		}
	}
}
