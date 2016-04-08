package com.api.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
//		method(map);
		
		getElement(map);
	}

	public static void getElement(Map<Integer, String> map) {
		map.put(10, "wangcai");
		map.put(10, "xiaoqiang");
		map.put(8, "zhangsan");
		map.put(5, "lisi");
		
		Collection<String> values = map.values();
		
		Iterator<String> it2 = values.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		
		//取出map中的所有元素
		//原理：通过KeySet获取map中所有的键所在的Set集合，再通过Set的迭代器获取到每一个键，再对其获取值即可。
		Set<Integer> s = map.keySet();
		for(Integer key : s){
			System.out.println(key + ":" + map.get(key));
		}
//		Iterator<Integer> it = s.iterator();
//		while (it.hasNext()) {
//			Integer integer = (Integer) it.next();
//			System.out.println(map.get(integer));
//		}
		
		
		/*
		 * 通过Map转成Set就可以迭代
		 * 找到了另一个方法。entrySet。
		 * 该方法将键和值的映射关系作为对象存储到了Set集合中，而这个映射关系的类型就是Map.Entry类型。
		 */
		Set<Map.Entry<Integer, String>> sme = map.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = sme.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + "..." + entry.getValue());
			
		}
		
	}

	public static void method(Map<Integer, String> map) {//学号和姓名
		
		//添加元素
		System.out.println(map.put(10, "wangcai"));
		System.out.println(map.put(10, "xiaoqiang"));
		map.put(8, "zhangsan");
		map.put(5, "lisi");
		System.out.println(map);
		
		//删除元素
//		System.out.println(map.remove(10));
		
		//判断
		System.out.println("ContainsKey:" + map.containsKey(10));
		
		//获取
		System.out.println("get:" + map.get(5));
	}

}
