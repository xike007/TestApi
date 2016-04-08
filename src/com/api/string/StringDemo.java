package com.api.string;

public class StringDemo {

	public static void main(String[] args) {
		
		/*
		 * String类的特点：
		 * 字符串对象一旦被初始化就不会被改变。
		 */
		
		StringDemo2();
	}

	
	private static void StringDemo2() {
		String s = "abc";
		
		String s1 = new String("abc");
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
	}


	private static void StringDemo1() {
		String s = "abc"; //"abc"存储在常量池中
		
		String s1 = "abc";
		System.out.println(s == s1);
		System.out.println(s.substring(2,3));
	}
}
