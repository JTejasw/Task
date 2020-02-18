package com.mits.corejava.Exception;

/**
 * @author mitsind759
 *TryWithMultipleCatchDemo
 */
public class TryWithMultipleCatchDemo {// class declaration

	public static void main(String[] args) {// main declaration
		try {
			String sNo1 = args[0];// ArrayIndexOutofBoundsException
			String sNo2 = args[1]; // ArrayIndexOutofBoundsException

			int n1 = Integer.parseInt(sNo1); // NumberFormatException
			int n2 = Integer.parseInt(sNo2); // NumberFormatException

			System.out.println("Before division");
			double divResult = n1 / n2; // ArithmeticException
			System.out.println("div of " + n1 + " and " + n2 + " is :" + divResult);

		} catch (ArithmeticException e) {
			System.out.println("in catch block of ArithmeticException");
			e.printStackTrace();

			System.out.println("ArithmeticException occured " + e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("in catch block of ArrayIndexOutOfBoundsException");
			e.printStackTrace();

			System.out.println("ArrayIndexOutOfBoundsException occured " + e.getMessage());

		} catch (NumberFormatException e) {
			System.out.println("in catch block of NumberFormatException");
			e.printStackTrace();
			System.out.println("NumberFormatException occured " + e.getMessage());
		} catch (Exception e) {

			System.out.println("in catch block of Exception");
			e.printStackTrace();
			System.out.println("Exception occured " + e.getMessage());

		}

		System.out.println("Statement after try/catch");

	}// closing main
}// closing class
