package com.mits.corejava.Exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomException {

	static void Credentialvalidate(StringBuffer sb) throws InvalidCredentialsException {
		if (sb.length() == 0) {
			System.out.println("accept registration");
		}

		else {
			System.out.println(sb.toString());
			throw new InvalidCredentialsException("failed registration");
			
		}

	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your first name:");
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

		StringBuffer sb = new StringBuffer();
		int count = 0;
		if (firstname!=null) {
			
		for (int i = 0; i < firstname.length(); i++) {
				char ch = firstname.charAt(i);
			if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
				 }
				 else {
					count++;
					}
            if(count>0){
				sb.append("Invaild name firstname consists of only letters \t");
				}
				} 
			/*if (!(Pattern.matches("[a-zA-Z]", firstname))) {
				sb.append("Invaild name due to you enter other then alphabits  \t");
			}} 
		if (lastname!=null) {
			if (!(Pattern.matches("[a-zA-Z]", lastname))) {
				sb.append("Invaild name due to you enter other then alphabits  \t");
			}*/

		}
		if (!(email.contains("@gmail.com"))) {
			sb.append("Invaild  emailid\t");

		} 
		if (!(dob.length() == 10)) {
			sb.append("invaild dod\t");
		} 
		if (!(gender.equalsIgnoreCase("female") || (gender.equalsIgnoreCase("male"))) ){
			sb.append("invaild gender\t");
		} 
		if (!(maritalStatus.equalsIgnoreCase("single") || (maritalStatus.equalsIgnoreCase("married")))) {
			sb.append("invaild marital\t");

		} 
		if (!(phonenumber.length() == 10)) {
			sb.append("invaild phonenumber\t");
		}
		if(! (pincode.length() == 6) ){
			sb.append("invaild pincode\t");
		} 
		try {
           Credentialvalidate(sb);
		} catch (Exception e) {
			System.out.println("exception handled:"+e);
		}
	}

}

class InvalidCredentialsException extends Exception {
	InvalidCredentialsException(String s) {
		super(s);
	}
}