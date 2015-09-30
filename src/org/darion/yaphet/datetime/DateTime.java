package org.darion.yaphet.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class DateTime {

	private static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";

	private long toTimeStamp(String time, String format) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		Date date = dateFormat.parse(time);
		return date.getTime();
	}

	private long toTimeStamp(String time) throws ParseException {
		return toTimeStamp(time, DEFAULT_FORMAT);
	}

	private String toDateTime(long timestamp, String format) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(timestamp);
	}

	private String toDateTime(long timestamp) {
		return toDateTime(timestamp, DEFAULT_FORMAT);
	}

	private String getDate(String dateTime) {
		return "";
	}

	private String getTime(String dateTime) {
		return "";
	}

	public static void main(String[] args) throws ParseException {
		DateTime instance = new DateTime();

		// date time <--> time stamp
		System.out.println("2015-09-30 14:58:30 --> " + instance.toTimeStamp("2015-09-30 14:58:30"));
		System.out.println("1443596310000 --> " + instance.toDateTime(1443596310000L));

		System.out.println("2015-09-30 14:58:30's date : " + instance.getDate("2015-09-30 14:58:30"));
		System.out.println("2015-09-30 14:58:30's time : " + instance.getTime("2015-09-30 14:58:30"));

	}
}
