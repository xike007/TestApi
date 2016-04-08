package com.api.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {

		/*
		 * StringBuffer:就是字符串缓冲区。
		 * 用于存储数据的容器。
		 * 特点：
		 * 1、长度可变的。
		 * 2、可以存储不同类型数据
		 * 3、最终要转成字符串进行使用
		 * 4、可以对字符串进行修改
		 * 
		 * 
		 * 既然是一个容器对象，应该具备什么功能呢？
		 * 1、添加：
		 * 	StringBuffer append(data);
		 * 	StringBuffer insert(index,data);
		 * 2、删除：
		 * 	StringBuffer delete(start,end);包含头，不包含尾
		 * 	StringBuffer deleteCharAt(index);删除指定位置的元素
		 * 3、查找：
		 * 	char charAt(index);
		 * 	int indexOf(string);
		 * 	int lastIndexOf(string);
		 * 4、修改：
		 * 	StringBuffer replace(start,end,string);
		 * 	void setCharAt(index,char);
		 * 
		 * 增删改查 C(create)U(update)R(read)D(delete)
		 */
		
//		bufferMethodDemo_1();
//		bufferMethodDemo_2();
		int[] arr = {1,3,5,2,8};
		
		String s = arrayToString(arr);
		System.out.println(s);
	}

	public static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i != arr.length-1){
				sb.append(arr[i]+", ");
			} else {
				sb.append(arr[i]+"]");
			}
		}
		return sb.toString();
	}

	public static void bufferMethodDemo_2() {
		StringBuffer sb = new StringBuffer("abcde");
		
		//清空缓冲区
//		sb.delete(0, sb.length());
		
//		try {
//			sb = null;
//			sb.replace(1, 3, "mn");
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		}
		
//		sb.setLength(10);
		sb.setCharAt(1, 'a');
		System.out.println(sb);
	}

	public static void bufferMethodDemo_1() {
		//创建缓冲区对象。
		StringBuffer sb = new StringBuffer();
		
		StringBuffer s1 = sb.append(4);
		
		System.out.println(sb == s1);
		
		s1.append(false);
		s1.insert(1, "haha");
		System.out.println(s1);
	}

}
