package com.api.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		/*
		 * 基本数据类型对象包装类
		 * 为了方便操作基本数据类型值，将其封装成了对象。在对象中定义了属性和行为丰富了该数据的操作。
		 * 用于描述该对象的类就称为本数据类型对象包装类。
		 * 
		 * byte		Byte
		 * short	Short
		 * int		Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * char		Character
		 * boolean	Boolean
		 * 
		 * 
		 * 该包装主要用于基本类型和字符串之间的转换。
		 * 
		 * 基本类型--->字符串
		 * 		1、基本类型数值+""
		 * 		2、用String类中的静态方法valueOf(基本类型数值);
		 * 
		 * 字符串--->基本类型
		 * 		1、使用包装类中的静态方法 xxx	parseXxx("xxx类型的字符串");
		 * 			int parseInt("intstring");
		 * 			long parseLong("longstring");
		 * 			boolean parseBoolean("booleanstring");
		 * 			只有Character没有parse方法
		 * 
		 */
		
//		System.out.println(Integer.MAX_VALUE);
		
		
		int x = Integer.parseInt("12345");
		System.out.println(x + 1);
		
		Integer i = new Integer("123");
		System.out.println(i.intValue() + 2);
		
		/*
		 * 进制转换
		 * 
		 */
		
//		十进制-->其他进制
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		
//		其他进制-->十进制
		System.out.println(Integer.parseInt("3c", 16));
		
	}
}
