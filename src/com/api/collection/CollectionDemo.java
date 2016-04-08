package com.api.collection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo {

	public static void main(String[] args) {

		Collection coll = new ArrayList();
		show(coll);
	}

	private static void show(Collection coll) {
		
		//1、添加元素。add
		coll.add("abc");
		coll.add("123");
		coll.add("def");
		System.out.println(coll);
		
		//2、删除元素。remove
		coll.remove("abc");	//会改变集合的长度
		System.out.println(coll);
		
//		//清空集合
//		coll.clear();
//		System.out.println(coll);
		
		System.out.println(coll.contains("abc"));
		
		
	}

}
