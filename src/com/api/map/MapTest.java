package com.api.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

		String str = "fdg+avAdc  bs5dDa9c-dfs";

		String s = getCharCount(str);

		System.out.println(s);
	}

	public static String getCharCount(String str) {
		
		//将字符串变成字符数组
		char[] chs = str.toCharArray();
		Map<Character, Integer> map = new TreeMap<>();
		
		for (int i = 0; i < chs.length; i++) {
			if(!(chs[i] >= 'a' && chs[i] <= 'z' || chs[i] >= 'A' && chs[i] <= 'Z')){
				continue;
			}
			
			Integer value = map.get(chs[i]);
			
			if(value == null){
				map.put(chs[i], 1);
			} else {
				map.put(chs[i], value+1);
			}
		}
		
		return mapToString(map);
	}

	private static String mapToString(Map<Character, Integer> map) {
		
		StringBuilder sb = new StringBuilder();
		
		Iterator<Character> it = map.keySet().iterator();
		while (it.hasNext()) {
			Character key = it.next();
			Integer value = map.get(key);
			sb.append(key + ":" + value + "\n");
		}
		return sb.toString();
	}

}
