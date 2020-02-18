package com.mits.corejava.oops;

import java.util.Scanner;//import scanner 

/**
 * @author mitsind759
 * taking input form user 
 * creating object ArithamaticOperation
 * print output ArithamaticOperation by calling methods
 */
public class ArithamaticDemo {// open class

	public static void main(String[] args) {// open main

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);// creating scanner object
		System.out.println("enter your num1:");//taking input form user num1
		int num1 = sc.nextInt();//assign variable
		System.out.println("enter your num2:");//taking input form user num2
		int num2 = sc.nextInt();//assign variable
		// creating object
		ArithamaticOperation obj = new ArithamaticOperation(); 
		// print output
		System.out.println("Addition of two numbers: " + obj.add(num1, num2));
		System.out.println("Substraction of two numbers: " + obj.sub(num1, num2));
		System.out.println("multiplication of two numbers: " + obj.mul(num1, num2));
		System.out.println("Division of two numbers: " + obj.div(num1, num2));
	}// end main

}// end class
