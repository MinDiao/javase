package com.tz.KnowledgePoint;
/**
 * 	普通法求最大值, 最小值
 */
public class MaxMin {
	public static void main(String[] args) {
		int score[] = {42,12,65,85,25,32,42,54,65,32,13};
		int max = 0;
		int min = 0;
		max = min = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("最大值:"+ max);
		System.out.println("最小值:"+ min);
	}
}
