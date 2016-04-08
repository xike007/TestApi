package com.api.generic;


import java.util.Iterator;
import java.util.TreeSet;

import com.api.bean.Person;
import com.api.comparator.ComparatorByName;

public class GenericDemo {

	public static void main(String[] args) {

//		TreeSet<Person> ts = new TreeSet<Person>();
		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
		
		ts.add(new Person("zhangsan", 20));
		ts.add(new Person("lisi", 21));
		ts.add(new Person("wangwu", 22));
		ts.add(new Person("zhaoliu", 21));
		
		Iterator<Person> it = ts.iterator();
		
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p);
		}
		
		
		Tool<String> tool = new Tool<String>();
		tool.show("abc");
		tool.show(new Integer(4));
		tool.print("haha");
		Tool.method("def");
		Tool.method(new Integer(8));
	}

}



