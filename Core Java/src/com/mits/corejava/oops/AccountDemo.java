package com.mits.corejava.oops;
import java.util.Scanner;//import scanner
/**
 * @author mitsind759
 *create object of account
 *assign values for set details method
 *calling get method print the account name,account number
 *asking user to how much u deposit,  print balance
 */
//open class
public class AccountDemo {
	// open main
	public static void main(String[] args) {
		// create object
		Account obj = new Account();
				// assign values for set details method
        obj.setDetails(1234567890, "JTejaswini", 1000);
		// calling get method print the account name,account number
		System.out.println(obj.getAccountName());
		System.out.println(obj.getAccountNo());

		// creating scanner object
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		// asking user to how much u deposit
		System.out.println("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();//store variable
		obj.deposit(depositAmount);//assign to deposit method
		System.out.println("Balnce after depositAmount:" + obj.getBalance());// print balance
		// asking user to how much u withdraw
	    System.out.println("Enter withdraw Amount  for account1: ");
	    double specifiedAmount = input.nextDouble();//store variable
		obj.withdraw(specifiedAmount);//assign to withdraw method
		System.out.println("Balance after withdraw Amount:" + obj.getBalance());// print balance
		System.out.println("******************************************************************************");

		/*
		 * Account obj1 =new Account();//create another object
		 * obj1.setDetails(234253211, "vamsi", 500);//assign values //calling
		 * get method print the output
		 * System.out.println(obj1.getAccountName());
		 * System.out.println(obj1.getAccountNo());
		 * System.out.println(obj1.getBalance());
		 * 
		 * 
		 * //taking input form user System.out.println(
		 * "Enter deposit amount for account1: "); double depositAmount1 =
		 * input.nextDouble(); //asking user to how much u deposit
		 * 
		 * System.out.println("Balnce after depositAmount:"
		 * +obj1.getBalance());//print balance
		 * 
		 * System.out.println("Enter withdrawAmount  for account1: ");//asking
		 * user to how much u withdraw double specifiedAmount1 =
		 * input.nextDouble();
		 * 
		 * System.out.println("Balance after withdraw Amount:"
		 * +obj1.getBalance());//print balance
		 */

	}// end main

}// end class
