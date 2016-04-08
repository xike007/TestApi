package com.api.wrapper;

import java.util.Arrays;

/*
 * 对一个字符串中的数值进行从小到大的排序。
 * 
 * "20 78 9 -7 88 36 29"
 * 
 * 思路：
 * 1，排序，我很熟。可是我只熟int。
 * 2，如何获取到这个字符串中的这些需要排序的数值？
 * 发现这个字符串中其实都是空格来对数值进行分隔的。
 * 所以就想到用字符串对象的切割方法将大串变成多个小串。
 * 3，数值最终变成小字符串，怎么变成一个int数呢？
 * 字符串-->基本类型 可以使用包装类。
 * 
 * 
 */

public class WrapperTest {

	public static void main(String[] args) {

		String numStr = "20 78 9 -7 88 36 29";
		System.out.println(numStr);
		numStr = sortStringNumber(numStr);
		System.out.println(numStr);
	}

	public static String sortStringNumber(String numStr) {

		// 1、将字符串变成字符串数组
		String[] str_arr = stringToArray(numStr);

		// 2、将字符串数组变成int数组
		int[] num_str = toIntArrary(str_arr);

		// 3、对int数组进行排序
		mySortArray(num_str);

		// 4、将排序后的int数组变成字符串
		String temp = arrayToString(num_str);

		return temp;
	}

	public static String arrayToString(int[] num_str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num_str.length; i++) {
			if (i != num_str.length) {
				sb.append(num_str[i] + " ");
			} else {
				sb.append(num_str[i]);
			}
		}

		return sb.toString();
	}

	public static void mySortArray(int[] num_str) {
		Arrays.sort(num_str);
	}

	public static int[] toIntArrary(String[] str_arr) {

		int[] arr = new int[str_arr.length];
		for (int i = 0; i < str_arr.length; i++) {
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		return arr;
	}

	public static String[] stringToArray(String numStr) {
		String[] str_arr = numStr.split(" ");
		return str_arr;
	}

}
