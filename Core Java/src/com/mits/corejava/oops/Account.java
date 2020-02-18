package com.mits.corejava.oops;
/**
 * @author mitsind759 declaring variables of account no,name,balance using
 *         method for set and get details creating method for deposit,withdraw
 *         Check balance
 */
public class Account {// declaring class
	// declaring instance variables with private access modifier
	private int accountNo;
	private String accountName;
	private double balance;

	// creating set method
	public void setDetails(int accountNo, String accountName, double balance) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;

	}// end set method
	// creating get method with account no
     public int getAccountNo() {
		return accountNo;

	}// end get method with account no
	// creating get method with account name
     public String getAccountName() {
		return accountName;
	}// end get method with account name
	// creating deposit method

	public void deposit(double depositAmount) {
		balance = balance + depositAmount;

	}// end deposit method
	// creating withdraw method

	public void withdraw(double specifiedAmount) {
		balance = balance - specifiedAmount;

	}// end withdraw method
	// creating get method with balance

	public double getBalance() {
		return balance;
	}// end get method with balance

}// end class
