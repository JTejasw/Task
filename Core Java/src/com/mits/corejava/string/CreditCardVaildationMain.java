package com.mits.corejava.string;

import java.util.Scanner;

/**
 * @author mitsind759
 *Writing a program to read different values like Name (First and Last Name),
 * Email,DOB, Sex (M or F), Marital Status, Phone Number,Address, 
 * Occupation,Employer, City, PinCode  of a credit card application form from console .
 *  Validate the data for null values, specific format, mandatory fields etc.
 *  If data is valid application is accepted/registered/stored.
 *   For all the invalid data, display the error messages.
 *   Use StringBuffer to display the error messages. 
 *   For validations you may explore different approaches 
 */
public class CreditCardVaildationMain {// class declaration
	private static boolean validCredits(String email, String dob, String gender, String maritalStatus,
			String phonenumber, String pincode) {//creating method for validation

		if (email.contains("@gmail.com")) {
		} else {
			System.out.println("invaild gmail");
			return false;
		}
		if (dob.length() == 10) {
		} else {
			System.out.println("invaild dod");
			return false;
		}
		if (gender.equalsIgnoreCase("female") || (gender.equalsIgnoreCase("male"))) {
		} else {
			System.out.println("invaild gender");
			return false;
		}
		if (maritalStatus.equalsIgnoreCase("single") || (maritalStatus.equalsIgnoreCase("married"))) {
		} else {
			System.out.println("invaild marital");
			return false;
		}
		if (phonenumber.length() == 10) {
		} else {
			System.out.println("invaild phonenumber");
			return false;
		}
		if (pincode.length() == 6) {

		} else {
			System.out.println("invaild pincode");
			return false;
		}
		return true;
	}

	public static void main(String[] args) {// main declaration

		Scanner s = new Scanner(System.in);
		System.out.print("Enter your frist name:");
		String firstname = s.next();
		System.out.print("Enter your last name:");
		String lastname = s.next();
		System.out.print("Enter your emailL:");
		String email = s.next();
		System.out.print("Enter your date of date of birth:");
		String dob = s.next();
		System.out.print("Enter your gender:");
		String gender = s.next();
		System.out.print("Enter your marital status:");
		String maritalStatus = s.next();
		System.out.print("Enter your phone number:");
		String phonenumber = s.next();
		System.out.print("Enter your Address:");
		String address = s.next();
		System.out.print("Enter your occupation:");
		String occupation = s.next();
		System.out.print("Enter your Employee:");
		String employee = s.next();
		System.out.print("Enter your city:");
		String city = s.next();
		System.out.print("Enter your pincode:");
		String pincode = s.next();

		if (validCredits(email, dob, gender, maritalStatus, phonenumber, pincode)) {
			System.out.println("accept registration");
		} else {
			System.out.println("failed registration");
		}
	}// closing main
}// closing class


