package com.mits.corejava.Exception;

/**
 * @author mitsind759
 *TryCatchFinally block
 */
public class TryCatchFinally {//class declaration
	public static void main(String[] args) {//main declaration
		int a[] = new int[5];
		try {//TryCatchFinally block
			System.out.println(a[10]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} finally {
			System.out.println("finally block is always executed");
		}
	}//closing main
}//closing class

