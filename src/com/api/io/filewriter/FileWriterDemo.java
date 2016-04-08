package com.api.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {

		//创建一个可以往文件中写入字符数据的字符输出流对象
		/*
		 * 既然是往一个文件中写入文字数据，那么在创建对象时，就必须明确该文件（用于存储数据的目的地）
		 * 
		 * 如果文件不存在，则会自动创建。
		 * 如果文件存在，则会被覆盖。
		 * 
		 * 如果构造函数中加入"true",可以实现对文件进行续写。
		 */
//		FileWriter fw = new FileWriter("demo.txt");
		FileWriter fw = new FileWriter("demo.txt",true);
		
		/*
		 * 调用Writer对象中的write(string)方法，写入数据。
		 * 其实数据写入临时存储缓冲区中。
		 */
		fw.write("abjfaf" + LINE_SEPARATOR + "sfasf");
		
//		fw.flush();
		/*
		 * 关闭流，关闭资源。在关闭前就会先调用flush刷新缓冲区中的数据到目的地。
		 */
		fw.close();
	}

}
