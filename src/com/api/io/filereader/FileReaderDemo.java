package com.api.io.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		//创建读取字符数据的子对象
		/*
		 * 在创建读取流对象时，必须要明确被读取的文件。一定要确定该文件是存在的。
		 * 
		 * 用一个读取流关联已存在的文件。
		 */
		FileReader fr = new FileReader("demo.txt");
		
		//用Reader中的read方法读取字符。
		int ch = 0, i = 0;
		while ((ch = fr.read()) != -1) {
			System.out.println(++i + " " + (char)ch);
		}
	}

}
