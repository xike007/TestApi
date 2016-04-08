package com.api.system;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.omg.IOP.Codec;

public class SystemDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	
	public static void main(String[] args) {

		/*
		 * System:类中的方法和属性都是静态的。
		 * 
		 * 常见方法：
		 * long currentTimeMillis();获取当前时间的毫秒值。 
		 * 
		 */
//		long t1 = System.currentTimeMillis();
//		for (int i = 0; i < 10000000; i++) {
////			code..
//		}
//		long t2 = System.currentTimeMillis();
//		System.out.println(t2-t1);
		
		demo_1();
		
		System.out.println("hello-" + LINE_SEPARATOR + "world!");
	}

	public static void demo_1() {
		Properties props = System.getProperties();
		
		Set<String> nameSet = props.stringPropertyNames();
		for (String name : nameSet) {
			String value = props.getProperty(name);
			
			System.out.println(name + ":" + value);
		}
	}

}
