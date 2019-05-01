package com.tz.LSM_iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Iteration_2 {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(2, "c");
		run(map);
		run2(map);
		run3(map);
		run4(map);
	}
	//第一种：通过Map.keySet遍历key和value
	public static void run(Map<Integer,String> map) {
		System.out.println("第一种：通过Map.keySet遍历key和value");
		for (Integer key : map.keySet()) {
			System.out.println("key:"+ key +"  value:"+ map.get(key));
		}
	}
	
	//第三种：通过Map。entrySet使用iterator遍历key和value
	public static void run2(Map<Integer,String> map) {
		System.out.println("第二种：通过Map。entrySet使用iterator遍历key和value");
		/*Set<Map.Entry<Integer,String>> set = map.entrySet();
		Iterator<Map.Entry<Integer,String>> it = set.iterator();*/
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println("key:"+ entry.getKey() +"  value:"+ entry.getValue());
		}
	}
	
	//第四种：方法4、Entry映射关系对象foreach迭代
	public static void run3(Map<Integer,String> map) {
		System.out.println("第三种：通过Map.entrySet进行增强for循环遍历");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key"+ entry.getKey() +"  value:"+ entry.getValue());
		}
	}
	
	//第五种：使用Map集合中的values()方法，但只能迭代出其值
	public static void run4(Map<Integer,String> map) {
		System.out.println("第四种：通过Map。values()遍历所有的value，但不能遍历key");
		for (String values : map.values()) {
			System.out.println("value:"+ values);
		}
	}
}












