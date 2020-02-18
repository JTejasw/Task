package com.mits.corejava.Exception;

import java.util.Scanner;
import java.util.Arrays;
public class Overloading {
	static Scanner sc = new Scanner(System.in);
	public static double method(String x, String y) {
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		return a / b;

	}
	public static String method() {
		System.out.println("enter array sizes:");
		int z=sc.nextInt();
		int[] e  = { 1, 2, 3, 4, 5 };
		System.out.println(e[z]);
		return Arrays.toString(e);
	}
	/*public static int[] method() {
		int[] e = new int[k];
		return e;
	}
*/
	public static void main(String[] args) {
		

		String i = "";
		String j = "";
		//String k;
		Overloading mn = new Overloading();
	try {
			System.out.println("enter your i value:");
			i = sc.next();
            System.out.println("enter your j value:");
			j = sc.next();
			
			mn.method(i, j);
			System.out.println(mn.method(i, j));
			mn.method();
		  // System.out.print(mn.method());
	        }
	 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("number" + e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");

	}
	}


