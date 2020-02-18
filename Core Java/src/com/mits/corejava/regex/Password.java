package com.mits.corejava.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mitsind759
 * Writing a program to validate user password (with certain pattern), email etc
 */
public class Password {// class declaration

	public static void main(String[] args) {// main declaration
		Scanner s = new Scanner(System.in);
		System.out.println("Enter password:");//taking input form user
		String password = s.next();
		System.out.println("Enter email:");
		String email = s.next();
		boolean b1 = Pattern.matches("[a-zA-Z0-9]{6}", password);//password validation
		System.out.println("your password is" + b1);

		boolean b2 = Pattern.matches("teja@gmail.com", email);//email validation

		System.out.println("your email is" + b2);

	}// closing main
}// closing class
