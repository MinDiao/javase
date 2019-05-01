package com.tz.LSM_iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Iteration {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(2, "c");
		run1(map);
		run2(map);
		run3(map);
		run4(map);
		run5(map);
	}
	//方法1、while循环迭代
	public static void run1(HashMap<Integer, String> map) {
		//调用Map集合方法keySet()
		Set<Integer> set = map.keySet();
		//遍历Set集合
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			//it.next()返回的Set集合元素，也就是Map中的键
			Integer key = it.next();
			//调用Map集合中的方法get
			String value = map.get(key);
			System.out.println("key:"+ key +"\tvlaue:"+ value);
		}
	}
	//方法2、foreach迭代
	public static void run2(HashMap<Integer, String> map) {
		System.out.println();
		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println("key:"+ key +"\tvlaue:"+ value);
		}
	}
	//方法3、Entry映射关系对象while迭代
	public static void run3(HashMap<Integer, String> map) {
		System.out.println();
		//调用Map集合方法entrySet()将集合中的映射关系对象，存储到Set集合
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		//迭代Set集合
		Iterator<Map.Entry<Integer, String>> it = set.iterator();
		while (it.hasNext()) {
			//获取出的Set集合的元素，是映射关系的对象。
			//it.next()获取的是什么对象，也是Map.Entry的对象
			Map.Entry<Integer, String> entry = it.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key:"+ key +"\tvlaue:"+ value);
		}
	}
	//方法4、Entry映射关系对象foreach迭代
	public static void run4(HashMap<Integer, String> map) {
		System.out.println();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key:"+ entry.getKey() +"\tvlaue:"+ entry.getValue());
		}
	}
	//方法5、使用Map集合中的values()方法，但只能迭代出其值
	public static void run5(HashMap<Integer, String> map) {
		System.out.println();
		for (String value : map.values()) {
			System.out.println("value:"+ value);
		}
	}
}












