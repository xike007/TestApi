package com.api.net.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	public static void main(String[] args) throws UnknownHostException {

		//获取本地主机IP地址对象
		InetAddress ip = InetAddress.getLocalHost();
		
		//获取其他主机IP地址对象
		ip = InetAddress.getByName("kebi-PC");
//		ip = InetAddress.getByName("115.206.9.218");
		
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
	}

}
