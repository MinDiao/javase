package com.hp.day06;
/*
 * 冒泡排序
 */
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {42,12,65,85,25,32,42,54,65,32,13};
		int temp = 0;
		//外层：有多少元素排序多少次，最少排序的次数为数组长度减1
		for (int i = 0; i < arr.length - 1; i++) {//上下减去1防止内层for下标越界
			//内层：有多少元素比较多少次，最少排序次数为减去每次排序好的个数
			for (int j = 0; j < arr.length - 1 - i; j++) {//减i可以提高效率
				//比较相邻的元素大小，如果前者大于后者，则交换
				if (arr[j] < arr[j + 1]) {//改变大小关系可以改变排列顺序
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
		
		/*int e = 0;
		for (int i : arr) {
			e++;
			if (e == arr.length) {
				System.out.print(i);
			} else {
				System.out.print(i +",");
			}
		}*/
		
		/*for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] +",");
			}
		}*/
	}
}
