package com.sample.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDate {
	public static void main(String[] args) {
		// Create new calendar
		Calendar cal = Calendar.getInstance();
		// Create instance of SimpleDateFormat class using pattern
		SimpleDateFormat dateFormatter1 = new SimpleDateFormat("MMMMM dd yyyy");
		String result = null;
		result = dateFormatter1.format(cal.getTime());
		System.out.println(result);

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		// Set the date to 01/01/2010:12:00
		cal2.set(2010, 0, 1, 12, 0);
//		System.out.println(formatDate(cal1) + " before " + formatDate(cal2) + "? " + cal1.before(cal2));
		System.out.println(cal2.compareTo(cal1));
	}
}
