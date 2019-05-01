package com.tz.LSM_iteration;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Iteration {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("张三");
		set.add("张三");
		run1(set);
		run2(set);
		run3(set);
	}
	
	public static void run1(Set<String> set) {
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
	
	public static void run2(Set<String> set) {
		System.out.println();
		for (Iterator<String> it = set.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}
	
	public static void run3(Set<String> set) {
		System.out.println();
		for (String s : set) {
			System.out.println(s);
		}
	}
}
