package com.mits.corejava.string;

import java.util.Scanner;

/**
 * @author mitsind759
 *Write a program to read username,  password from console and validate . 
 *if user name is "admin" and password is "password123" then display "Login successful" 
 *otherwise  display "Login failed due to invalid user name or password"
 *Write a Java method to check whether a string is a valid password. 
 */
public class LoginVerfication {// class declaration

	public static void main(String[] args) {//main declaration
		Scanner s = new Scanner(System.in);//read username,  password from console and validate . 
		System.out.println("Enter userId:");
		String userId = s.next();

		System.out.println(" Enter password:");
		String password = s.next();
		if (userId.equals("mitsind759") && (password.equals("password123"))) {//validate 
			System.out.println("login success");
		} else {
			System.out.println("login failed due to invalid credentials");
		}

	}// closing main
}// closing class

