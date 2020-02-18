package com.mits.corejava.string;

import java.util.Scanner;

/**
 * @author mitsind759
 * Declare a String variable and assign your full name to the variable.
 *  Convert your full name to lowercase, uppercase and display them in separate lines
 *  Extract your firstname, middlename, surname and display in separate lines. 
 *  Use String class functions wherever necessary
 */
public class FullName {// class declaration

	public static void main(String[] args) {// main declaration
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.print("Enter your frist name");
		String firstname = s.next();
		System.out.print("Enter your middle name");
		String secondname = s.next();
		System.out.print("Enter your last name");
		String lastname = s.next();
		String fullname = firstname + ":" + secondname + ":" + lastname;
		String fullname1 = fullname;
		System.out.println(fullname.toLowerCase());// Convert your full name to lowercase, 
		System.out.println(fullname.toUpperCase());//uppercase and 
		String[] arr = fullname1.split(":");//display them in separate lines
		for (String w : arr) {
			System.out.println(w);
		}
	}// closing main
	}// closing class

