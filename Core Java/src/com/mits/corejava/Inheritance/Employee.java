package com.mits.corejava.Inheritance;

public class Employee extends Person {

	
	public Employee()
	{
		
		super(200.00889,2015,"hhh425125666");
		
	}

	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ", year=" + year + ", insuranceNumber=" + insuranceNumber
				+ "]";
	}
	
	

}
