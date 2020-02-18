package com.mits.corejava.datetimecalender;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author mitsind759
 * Writing a Java Program to read a date in dd/MM/yyyy format.
 * Validate and Convert it into mm/dd/yyyy format and display
 * Writing a Java Program to take two dates as input and compare, equal, after or before 
 */
public class DateFormate {// class declaration

	public static void main(String[] args) {// main declaration throws Exception 
		Date d = new Date();//creating date object

		System.out.println(d);//printing current date
		SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");//creating SimpleDateFormat object
		System.out.println(sdfrmt.format(d));//printing  SimpleDateFormat object
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//Convert it into mm/dd/yyyy formate
		System.out.println(df.format(d));//display
		String d2 = df.format(d);
		Date d1 = new Date();
         System.out.println(d1);
		if (d2.length() == 10) {// Validate

			System.out.println("validation date");
		}
		System.out.println("date after " + d1.after(d));//date after
		System.out.println("date befor " + d1.before(d));//date befor
		System.out.println("date equals " + d1.equals(d));//date equals 
		System.out.println("date compareto " + d1.compareTo(d));//date compareto

	}// closing main
}// closing class
