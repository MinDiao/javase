package com.tz.KnowledgePoint;
/*
 * 	插入排序法
 */
public class InsertSort {
	public static void main(String[] args) {
		int score[] = {42,12,65,85,25,32,42,54,65,32,13}; //静态初始化
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {
					int temp = score[i];
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
