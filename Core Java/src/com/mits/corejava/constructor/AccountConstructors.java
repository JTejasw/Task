package com.mits.corejava.constructor;

/**
 * @author mitsind759
 *declaring instance variables with private access modifier
 *creating parameterized  constructor to initialize values,deposit method,withdraw method,account details method
 */
public class AccountConstructors {// declaring class
	// declaring instance variables with private access modifier
	private int accountNo;
	private String accountName;
	private double balance;
	// creating parameterized  constructor
	public AccountConstructors(int accountNo, String accountName, double balance) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
     }// creating deposit method
	public void deposit(double depositAmount)
	{
		balance = balance + depositAmount;

	}// end deposit method
	 // creating withdraw method
	public void withdraw(double specifiedAmount) {
		balance = balance - specifiedAmount;
         
	}// end withdraw method
	// creating get method for balance
	public double getBalance()
	{
		return balance;
	}// end get method with balance
	// creating get method for account details
	public String getAccountDetails() {
		return "Account No:" + accountNo + "\nAccount Name:" + accountName + "\nBalance:" + balance;
	}

}//ending class
