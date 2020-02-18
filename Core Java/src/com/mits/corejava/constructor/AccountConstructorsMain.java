package com.mits.corejava.constructor;
import java.util.Scanner;//import scanner
/**
 * @author mitsind759
 *create object with AccountConstructors passing values in constructor
 *asking user to how much u deposit,withdraw
 *print balance
 */
//open class
public class AccountConstructorsMain {
	// open main
	public static void main(String[] args) {
		// create object with AccountConstructors passing values in constructor
		AccountConstructors objAccount = new AccountConstructors(1234567890, "JTejaswini", 1000);
		System.out.println(objAccount.getAccountDetails());
         // creating scanner object
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.println("Enter deposit amount for account1: ");// asking user to how much u deposit
		double depositAmount = input.nextDouble();//store in variables
		objAccount.deposit(depositAmount);//assign to deposit method
		System.out.println("Balnce after depositAmount:" + objAccount.getBalance());// print balance
        System.out.println(objAccount.getBalance());// obtain user input
		System.out.println("Enter withdraw Amount  for account1: ");// asking user to how much u withdraw
		double specifiedAmount = input.nextDouble();//store in variables
		objAccount.withdraw(specifiedAmount);//assign to withdraw method
		System.out.println("Balance after withdraw Amount:" + objAccount.getBalance());// print balance
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

	}//end main

}//end class
