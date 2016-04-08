package com.api.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class IteratorDemo {

	public static void main(String[] args) {
		
		Collection coll = new ArrayList();
		Collection arr = new ArrayList();
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		Iterator iterator = coll.iterator();
		while(iterator.hasNext()){
			Object s = iterator.next();
//			if(!s.equals("abc1")){
//				arr.add(s);
//			}
			if(s.equals("abc1")){
				iterator.remove();
				iterator.next();
			}
		}
		System.out.println(coll);
	}

}
