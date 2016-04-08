package com.api.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.api.bean.Person;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(new Person("lisi1",21));
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi4",24));
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		System.out.println(al);
		
		al = getSingleElement(al);
		System.out.println(al);
		
		System.out.println(al.remove(new Person("lisi2",22)));
		System.out.println(al);
		
		/*HashSet hs = new HashSet();
		
		hs.add("hehe");
		hs.add("heihei");
		hs.add("haha");
		hs.add("hehe");
		
		System.out.println(hs);*/
	}

	public static ArrayList getSingleElement(ArrayList al) {
		
		//1、定义一个临时容器。
		ArrayList temp = new ArrayList();
		
		//2、迭代al集合。
		Iterator it = al.iterator();
		
		while (it.hasNext()) {
			Object obj = it.next();
			//3、判断被迭代到的元素是否在临时容器存在。
			if(!temp.contains(obj)){
				temp.add(obj);
			}
			
		}
		return temp;
	}

}
