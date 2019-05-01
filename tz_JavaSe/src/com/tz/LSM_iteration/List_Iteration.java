package com.tz.LSM_iteration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_Iteration {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("张三");
		run1(list);
		run2(list);
		run3(list);
	}
	//while循环方式迭代
	public static void run1(List<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
	
	//for循环方式迭代
	public static void run2(List<String> list) {
		System.out.println();
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}
	
	//foreach方法迭代
	public static void run3(List<String> list) {
		System.out.println();
		for (String s : list) {
			System.out.println(s);
		}
	}
}
