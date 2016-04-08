package com.api.string;

public class StringMethodDemo {

	public static void main(String[] args) {

		/*
		 * 按照面向对象的思想对字符串进行功能分类。
		 * "abcd"
		 * 
		 * 1,获取：
		 * 1.1 获取字符串中字符的个数(长度).
		 * 		int length();
		 * 1.2 根据位置获取字符。
		 * 		char charAt(int index);
		 * 1.3 根据字符获取在字符串中的第一次出现的位置.
		 * 		int indexOf(int ch)
		 * 		int indexOf(int ch,int fromIndex):从指定位置进行ch的查找第一次出现位置 
		 * 		int indexOf(String str);
		 * 		int indexOf(String str,int fromIndex);
		 * 		 根据字符串获取在字符串中的第一次出现的位置.
		 * 		int lastIndexOf(int ch)
		 * 		int lastIndexOf(int ch,int fromIndex):从指定位置进行ch的查找第一次出现位置 
		 * 		int lastIndexOf(String str);
		 * 		int lastIndexOf(String str,int fromIndex);
		 * 1.4 获取字符串中一部分字符串。也叫子串.
		 * 		String substring(int beginIndex, int endIndex)//包含begin 不包含end 。
		 * 		String substring(int beginIndex);
		 * 		
		 * 
		 * 
		 * 2，转换。
		 * 		2.1 将字符串变成字符串数组(字符串的切割)
		 * 			String[]  split(String regex):涉及到正则表达式.
		 * 		2.2 将字符串变成字符数组。
		 * 			char[] toCharArray();
		 * 		2.3 将字符串变成字节数组。
		 * 			byte[] getBytes();
		 * 		2.4 将字符串中的字母转成大小写。
		 * 			String toUpperCase():大写
		 * 			String toLowerCase():小写
		 *		2.5  将字符串中的内容进行替换
		 *			String replace(char oldch,char newch);
		 * 			String replace(String s1,String s2);
		 * 		2.6 将字符串两端的空格去除。
		 * 			String trim();
		 * 		2.7 将字符串进行连接 。
		 * 			String concat(string);
		 * 
		 * 3，判断
		 * 		3.1 两个字符串内容是否相同啊？
		 * 			boolean equals(Object obj);
		 * 			boolean equalsIgnoreCase(string str);忽略大写比较字符串内容。
		 * 		3.2 字符串中是否包含指定字符串？
		 * 			boolean contains(string str);
		 * 		3.3 字符串是否以指定字符串开头。是否以指定字符串结尾。
		 * 			boolean startsWith(string);
		 * 			boolean endsWith(string);
		 * 		
		 * 4，比较。
		 * 		
		 */
		
		StringMethodDemo3();
		
//		StringMethodDemo2();
		
//		StringMethodDemo1();
	}

	private static void StringMethodDemo3() {
		String s = "abc";
		System.out.println(s.equals("ABC".toLowerCase()));
		System.out.println(s.equalsIgnoreCase("ABC"));
		
		System.out.println(s.contains("cc"));
		
		String arr = "Array.java";
		System.out.println(arr.startsWith("Array"));
		System.out.println(arr.endsWith("java"));
	}

	private static void StringMethodDemo2() {
		String s = "张三,李四,王五";
		String[] arr = s.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		
		System.out.println("Abc".toUpperCase());
		System.out.println("Abc".toLowerCase());
		
		System.out.println("java".replace('p', 'b'));
	}

	private static void StringMethodDemo1() {
		String s = "abcad";
		System.out.println("length:" + s.length());
		System.out.println("charAt:" + s.charAt(2));
		System.out.println("indexOf:" + s.indexOf('a'));
		System.out.println("lastIndexOf:" + s.lastIndexOf('a'));
		System.out.println("subString:" + s.substring(1,2));
	}

}
