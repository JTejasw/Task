package com.mits.corejava.constructor;

public class AccountConstructorUsingSwitch {
	   private int accountNo;
	   private String accountName;
	   private double balance;
		
		public AccountConstructorUsingSwitch(int accountNo, String accountName,double balance) {
			this.accountNo = accountNo;
			this.accountName = accountName;
			this.balance=balance;
			
	     }
		public double deposit(double depositAmount)
		{
			balance = balance + depositAmount;
              return balance;
		}
		public double withdraw(double specifiedAmount) {
			balance = balance-specifiedAmount;
			return balance;
	         
		}
		public double getBalance()
		{
			return balance;
		}
		public String getAccountDetails() {
			return "Account No:" + accountNo + "\nAccount Name:" + accountName + "\nBalance:" + balance;
		}

	}


