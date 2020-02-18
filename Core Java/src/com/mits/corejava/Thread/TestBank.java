package com.mits.corejava.Thread;

class Bank {//open class Bank
	private int balance;

	public Bank(int balance) {//constructor 

		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public synchronized int withdraw(int withdrawAmount) {

		if (withdrawAmount <= balance) {
			synchronized (this) {

				balance = balance - withdrawAmount;
				
				System.out.println(Thread.currentThread().getName() + "sucess ");
				return balance;
			}

		} else {
			System.out.println(Thread.currentThread().getName() + "no balance");
			return balance;
		}
//return balance;
	}
}

class withdrawAccount extends Thread {
	private Bank acc;
	private int withdrawAmount;
	int w;

	public withdrawAccount(Bank acc, int amount) {
		this.acc = acc;
		this.withdrawAmount = amount;
	}

	public void run() {
	
		acc.withdraw(withdrawAmount);
		System.out.println("Balance after withbraw  " + currentThread().getName() + "balance " + acc.getBalance());

	}

}

class withdrawAccount1 extends Thread {
	private Bank acc;
	private int amount;

	public withdrawAccount1(Bank acc, int amount) {
		this.acc = acc;
		this.amount = amount;
	}

	public void run() {
		acc.withdraw(amount);
		System.out.println("Balance after withbraw  " + currentThread().getName() + "balance " + acc.getBalance());
	}

}

public class TestBank {
	public static void main(String[] args) {
		Bank ba = new Bank(200);
		withdrawAccount t1 = new withdrawAccount(ba, 200);
		withdrawAccount1 t2 = new withdrawAccount1(ba, 200);

		t1.start();
		t2.start();

	} //ending main
}//ending class
