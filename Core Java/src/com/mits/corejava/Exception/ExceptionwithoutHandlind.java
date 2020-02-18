package com.mits.corejava.Exception;
import java.util.Scanner;

/**
 * @author mitsind759
 *
 */
public class ExceptionwithoutHandlind {//class declaration

	public static void main(String[] args) {//main declaration

		Scanner objScanner = new Scanner(System.in);//creating scanner object

		System.out.println("Enter Number 1");//taking inputs num1,num2
		int n1 = objScanner.nextInt();

		System.out.println("Enter Number 2");
		int n2 = objScanner.nextInt();
		System.out.println("Before division");

		double divResult = n1 / n2;//division operation
		System.out.println("div of " + n1 + " and " + n2 + " is :" + divResult);//printing division output
		System.out.println("***************************************");

		System.out.println("Before multiplication");

		double mulResult = n1 * n2;//multiplication operation
		System.out.println("mul of " + n1 + " and " + n2 + " is : :" + mulResult);//printing multiplication output
	}//closing main
}//closing class