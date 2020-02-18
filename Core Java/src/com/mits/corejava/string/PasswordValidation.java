package com.mits.corejava.string;

import java.util.Scanner;

/**
 * @author mitsind759
 *Writing a Java method to check whether a string is a valid password. 
 *Password rules:
 *A password must have at least ten characters.
 *A password consists of only letters and digits.
 *A password must contain at least two digits.

 */
public class PasswordValidation {// class declaration
	private static boolean validPassword(String password) {
		int numcount = 0;
		if (password.length() < 10) {
			System.out.println("A password must have at least ten characters");
			return false;
		} else {
			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				if ((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {

				} else {
					System.out.println("A password consists of only letters and digits");
					return false;
				}

				if ((ch >= 48 && ch <= 57)) {
					System.out.println();
					numcount++;
				}
			}

			if (numcount < 2) {
				System.out.println("A password must contain at least two digits...");
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {//main declaration

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter userId:");
		String userId = s.next();
		System.out.println(
				"set password \nA password must have at least ten characters.\nA password consists of only letters and digits.\nA password must contain at least two digits...");
		System.out.println(" Enter password:");
		String password = s.next();
		if (validPassword(password)) {
			System.out.println("login success");
		} else {
			System.out.println("login failed due to invalid credentials");
		}
	}// closing main
	}// closing class

