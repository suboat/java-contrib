package com.suboat.contrib.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {

	public static Date stringToDate(String dateTimeStr) throws ParseException {
		// 传入的格式必须是yyyy-MM-dd'T'HH:mm:ss
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		// 2019-09-09 设置为东八区时区
		format.setTimeZone(TimeZone.getTimeZone("Asia/ShangHai"));
		return format.parse(dateTimeStr);
	}

	public static Date dateToDate(Date date) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		format.setTimeZone(TimeZone.getTimeZone("Asia/ShangHai"));
		return stringToDate(format.format(date));
	}

}
