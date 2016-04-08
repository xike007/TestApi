package com.api.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) throws ParseException {
		
		Date nowDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(nowDate);
		int time = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(time);
		// getMonthMaximum();
		//
		// getCalendarToDate();
		//
		getDateToCalendar();
		//
		// getDateFormat();

		// getTextToDate();
		//
		// getWeekAndDay();
	}

	/**
	 * 计算一年中的第几星期。 |---1、计算某一天是一年中的第几星期。 |---2、计算一年中的第几星期是几号。
	 */
	public static void getWeekAndDay() {
		// 1、计算某一天是一年中的第几星期。
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println("今天是一年中的第" + cal.get(Calendar.WEEK_OF_YEAR) + "周");

		// 2、计算一年中的第几星期是几号。
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2015);
		calendar.set(Calendar.WEEK_OF_YEAR, 21);
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println(df.format(calendar.getTime()));
	}

	/**
	 * 将日期格式的字符串-->日期对象。 使用的是DateFormat类中的parse()方法。
	 * 
	 * @throws ParseException
	 */
	private static void getTextToDate() throws ParseException {
		String str_date = "2015年5月22日";
		str_date = "2015---5---22";

		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

		df = new SimpleDateFormat("yyyy---MM---ss");
		Date date = df.parse(str_date);

		System.out.println(date);
	}

	/**
	 * 对日期对象进行格式化。 将日期对象-->日期格式的字符串。 使用的是DateFormat类中的format方法。
	 */
	public static void getDateFormat() {
		Date date = new Date();

		// 获取日期格式对象，具备着默认风格。FULL和LONG可以指定风格。
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		// DateFormat dft = DateFormat.getDateTimeInstance(DateFormat.LONG,
		// DateFormat.LONG);
		// String str_date = dft.format(date);
		String str_date = df.format(date);
		System.out.println(str_date);

		// 如果风格自定义，解决方法：
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("格式化输出日期时间:" + sdf.format(date));
	}

	/**
	 * Date转化为Calendar。
	 */
	public static void getDateToCalendar() {
		Date date = new Date();
		System.out.println(df.format(date)); // 获取时间戳值
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(cal.DATE, 14);
		System.out.println(df.format(cal.getTime()));
		// System.out.println(cal.getInstance().getTimeInMillis()); //获取时间戳值
	}

	/**
	 * Calendar转化为Date。
	 */
	public static void getCalendarToDate() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);
	}

	/**
	 * 计算某一月份的最大天数。
	 */
	public static void getMonthMaximum() {
		Calendar time = Calendar.getInstance();
		time.clear(); // 在使用set方法之前，必须先clear一下，否则很多信息会继承自系统当前时间
		String date = "2015-04";
		time.set(Calendar.YEAR, Integer.parseInt(date.split("-")[0]));
		time.set(Calendar.MONTH, Integer.parseInt(date.split("-")[1]) - 1);// 注意,Calendar对象默认一月为0
		int day = time.getActualMaximum(Calendar.DAY_OF_MONTH);// 本月份的天数
		System.out.println(time.get(Calendar.MONTH) + 1 + "月份最大天数：" + day);
	}

}
