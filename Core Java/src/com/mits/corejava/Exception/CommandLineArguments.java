package com.mits.corejava.Exception;

/**
 * @author mitsind759
 * Understand and write program to pass data to the java program through command line arguments
 */
public class CommandLineArguments {//class declaration

	public static void main(String[] args) {//main declaration
		String s1 = args[0];//Assign array
		String s2 = args[1];
		try {//using try block to  place exception code

			double div = Integer.parseInt(s1) / Integer.parseInt(s2);
		} catch (ArithmeticException e) {//catch block used to handle the exception
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(" Exception occurs");
		}

	}//closing main

}//closing class
