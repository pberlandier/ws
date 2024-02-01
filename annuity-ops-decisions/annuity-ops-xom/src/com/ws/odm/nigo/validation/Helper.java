package com.ws.odm.nigo.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Helper {

	private static SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

	private Helper() {
	}

	/**
	 * Returns true iff the given string represents an integer.
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isInteger(String value) {
		try {
			Integer.parseInt(value);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	/**
	 * Returns true iff the given string represents a number.
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNumber(String value) {
		try {
			Double.parseDouble(value);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static int asInteger(String value) {
		return Integer.parseInt(value);
	}

	// Date helper functions

	public static Date asDate(String value) throws ParseException {
		return formatter.parse(value);
	}

	public static int getDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

}
