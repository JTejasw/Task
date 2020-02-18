package com.mits.corejava.Exception;

import java.util.Scanner;

/**
 * @author mitsind759
 *try-catch-finally block using methods
 */
public class Task {//class declaration
	public static void exceptionDemo() {//creating method
		/* System.out.println( 2 / 0 );
		 try{ System.out.println( 2 / 0 ); }catch ( ArithmeticException e ){
		  System.out.println("Attempted division by zero"); }
		 */
		try {//try-catch-finally block
			Scanner myScanner = new Scanner(System.in);
			System.out.print("Enter an integer ");
			String intString = myScanner.next();
			int i = Integer.parseInt(intString);
			System.out.println(2 / i);
		}

		catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
	}

	public static void main(String[] args) {//main declaration
		Task.exceptionDemo();//calling method
	}//closing main
}//closing class

