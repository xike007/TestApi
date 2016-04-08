package com.api.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	public static void main(String[] args) {

		FileWriter fw = null;
		try {
			fw = new FileWriter("k:/demo.txt");

			fw.write("ajasklfa答复");

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					throw new RuntimeException("关闭失败！");
				}
			}
		}
	}

}
