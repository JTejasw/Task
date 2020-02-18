package com.mits.corejava.constructor;

import java.util.Scanner;//import scanner 
/**
 * @author mitsind759
 *taking input form user  store in constructors
 *creating object ArithamaticOperation
 *print output ArithamaticOperation by calling methods
 */
public class ArithmeticConstructorMain {// open class
	public static void main(String[] args) {// open main
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);// creating scanner object
		System.out.println("enter your num1:");// taking input form user num1
		int num1 = sc.nextInt();// assign variable
		System.out.println("enter your num2:");// taking input form user num2
		int num2 = sc.nextInt();// assign variable
		// creating object
		ArithmeticConstructors obj = new ArithmeticConstructors(num1, num2);
		// print output
		System.out.println("Addition of two numbers: " + obj.add());
		System.out.println("Substraction of two numbers: " + obj.sub());
		System.out.println("multiplication of two numbers: " + obj.mul());
		System.out.println("Division of two numbers: " + obj.div());
	}// end main

}// end class
