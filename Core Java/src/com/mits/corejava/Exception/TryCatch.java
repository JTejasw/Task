package com.mits.corejava.Exception;

/**
 * @author mitsind759
 * try-catch block
 */
public class TryCatch {//class declaration

	public static void main(String[] args) {//main declaration
		try {// try-catch block
			// int arr[]= {1,3,5,7};
			// System.out.println(arr[6]); //may throw exception
			int a[] = new int[6];
			a[7] = 2;

		}
		// handling the array exception
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		System.out.println("rest of the code");

	}//closing main
}//closing class


