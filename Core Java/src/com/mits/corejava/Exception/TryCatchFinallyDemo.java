package com.mits.corejava.Exception;

import java.util.Scanner;

/**
 * @author mitsind759
 *TryCatchFinallyDemo
 */
public class TryCatchFinallyDemo {//class declaration

	public static void main(String[] args) {//main declaration
		Scanner objScanner = new Scanner(System.in);

		System.out.println("Enter Number 1");
		int n1 = objScanner.nextInt();

		System.out.println("Enter Number 2");
		int n2 = objScanner.nextInt();
		System.out.println("Before division");

		try {
			System.out.println("In try block....");
			double divResult = n1 / n2; // possibility for exception
			System.out.println("div of " + n1 + " and " + n2 + " is :" + divResult);

		}
catch (ArithmeticException e) {
	
			System.out.println("In catch block....");
			System.out.println("***************************************");
			e.printStackTrace();
			System.out.println("***************************************");

			System.out.println("Error occurred in division operation : " + e.getMessage());
		}  finally {
			System.out.println("In finally...this block will always executed....");
           // System.exit(0);
		}
		 
		System.out.println("After catch or finally....");

		System.out.println("***************************************");
		System.out.println("Before multiplication");

		double mulResult = n1 * n2;
		System.out.println("mul of " + n1 + " and " + n2 + " is : :" + mulResult);

	}//closing main
}//closing class




