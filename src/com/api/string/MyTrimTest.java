package com.api.string;

public class MyTrimTest {

	public static void main(String[] args) {
		String s = "    abc  def   ";
		System.out.println("-" + s + "-");
		System.out.println("-" + MyTrim(s) + "-");
	}

	public static String MyTrim(String s) {
		int start = 0;
		int end = s.length() - 1;

		while (start <= end && s.charAt(start) == ' ') {
			start++;
		}
		while (start <= end && s.charAt(end) == ' ') {
			end--;
		}

		return s.substring(start, end + 1);
	}

}
