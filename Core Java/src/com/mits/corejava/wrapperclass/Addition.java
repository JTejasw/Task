package com.mits.corejava.wrapperclass;

import java.util.Scanner;

/**
 * @author mitsind759
 *Reading two values (numbers) as String type from console 
 * calculate addition and display result. 
 */
public class Addition {// class declaration

	public static void main(String[] args) {// main declaration
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");//Reading two values (numbers) as String type from console 
		String num1 = s.next();

		int i1 = Integer.parseInt(num1); // Converting String into int using
											// Integer.parseInt()

		System.out.println(" Enter second number:");
		String num2 = s.next();
		int i2 = Integer.parseInt(num2); // Converting String into int using
											// Integer.parseInt()
		int sum = i1 + i2;
		System.out.println("addition of two numbers" + sum);//calculate addition and display result. 

	}// closing main
}// closing class


