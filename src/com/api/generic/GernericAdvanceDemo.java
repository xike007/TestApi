package com.api.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.api.bean.Person;
import com.api.bean.Student;
import com.api.bean.Worker;

public class GernericAdvanceDemo {

	public static void main(String[] args) {

		List<Worker> al1 = new ArrayList<Worker>();
		al1.add(new Worker("lisi1", 20));
		al1.add(new Worker("lisi2", 22));
//		ArrayList<Worker> mArrayList = null;
//		mArrayList = (ArrayList<Worker>) al1;
//		mArrayList.trimToSize();
		
		List<Student> al2 = new ArrayList<Student>();
		al2.add(new Student("lisi3", 20));
		al2.add(new Student("lisi4", 22));
		
		printCollection(al1);
		printCollection(al2);
	}

	/**
	 * 迭代并打印集合中的元素。
	 * 
	 * 可以对类型进行限定：
	 * ? extends E:接收E类型或者E的子类型对象。上限！
	 * 
	 * ? super E:接收E类型或者E的父类型。下限！
	 * @param al
	 */
	public static void printCollection(Collection<? extends Person> al) {
		Iterator<? extends Person> it = al.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p);
		}
	}

}
