package com.mits.corejava.interfacedemo;
interface ContractEmpolyee{
	public void joingDate();
	public void workinghours();
}
interface SalaryEmployee {
	public void desigination();
	public void experinace();
	
}
public class Employee implements SalaryEmployee,ContractEmpolyee{

	
		@Override
	public void joingDate() {
	  System.out.println("ContractEmpolyee joingDate");	
	}

	@Override
	public void workinghours() {
		 System.out.println("ContractEmpolyee workinghours");	
	}

	@Override
	public void desigination() {
		System.out.println("SalaryEmployee workinghours");	
		
	}

	@Override
	public void experinace() {
		
		System.out.println("SalaryEmployee workinghours");	
	}
	public static void main(String[] args) {
		Employee objemp =new Employee();
		objemp.joingDate();
		objemp.desigination();
	}
}
