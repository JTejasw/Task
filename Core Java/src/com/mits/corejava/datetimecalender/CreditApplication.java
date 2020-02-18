package com.mits.corejava.datetimecalender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author mitsind759
 * The SLA for credit card application processing is 5 days. 
 * Take the application received date from the user and calculate 
 * the SLA Date and display
 */
public class CreditApplication {// class declaration

	public static void main(String[] args) throws Exception {// main declaration throws Exception 
		Scanner s = new Scanner(System.in);
		System.out.println("application received date:");//application received date from user
		String date = s.next();
		Date da = new SimpleDateFormat("dd/MM/yyyy").parse(date);//Converting date format
		System.out.println("application received date:" + da);
		Calendar cal = Calendar.getInstance();//creating calendar
		cal.setTime(da);

		cal.add(Calendar.DAY_OF_MONTH, 5);//adding 5 days
		Date processdate = cal.getTime();
		System.out.println("credit card application processing is 5 days" + processdate);

	}// closing main
	}// closing class

