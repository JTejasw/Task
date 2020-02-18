package com.mits.corejava.datetimecalender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author mitsind759
 *Writing a program to execute certain statements as per the schedule day or time. 
 *If not display "Program exiting as it is not scheduled date or time"
 *if the day is configured day. (for e.g if the day is Sunday)
 * if the time is between the range (for e.g 10 PM to 11 PM)
 */
public class ScheduleDayOrTime {// class declaration
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {// main declaration
		Date d = new Date();//creating date object

		if ((d.getDay() == 0) && (d.getHours() >= 21 || d.getHours() <= 23)) {//day is Sunday and 10 PM to 11 PM

			System.out.println("it works");//execute certain statements 
		} else {
			System.out.println("not works");
		}

	}// closing main
}// closing class



