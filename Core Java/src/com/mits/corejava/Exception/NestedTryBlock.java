package com.mits.corejava.Exception;

import java.util.Scanner;

/**
 * @author mitsind759
 *nested try block.
 */
public class NestedTryBlock {//class declaration

	public static void main(String[] args) {//main declaration

		/*
		 try{ int a[]=new int[5]; a[4]=4;
		 try{ int b =39/0; } catch(ArithmeticException e){
		 System.out.println(e); }
		}catch(ArrayIndexOutOfBoundsException e){ System.out.println(e); }
		 System.out.println("normal flow..");
		  }
		 */

		try {//nested try block.
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number:");
			
			try {
				
				try {
					int a[] = new int[5];
					a[6] = 4;

				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
				}
				System.out.println("going to divide");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			// 2 System.out.println("other statement");
			int i = sc.nextInt();
		} catch (Exception e) {
			System.out.println("handeled");
		}

		System.out.println("normal flow..");
	}//closing main
}//closing class

