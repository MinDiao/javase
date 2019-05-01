package com.tz.KnowledgePoint;
/*
 * 	冒泡排序法: 思路二
 */
public class BubbleSort02 {
	public static void main(String[] args) {
		int score[] = {42,12,65,85,25,32,42,54,65,32,13}; //静态初始化
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length - i - 1; j++) {
				if (score[j] > score[j + 1]) { //交换位置
					int temp = score[j]; //中间变量
					score[j] = score[j + 1];
					score[j + 1] = temp;
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
