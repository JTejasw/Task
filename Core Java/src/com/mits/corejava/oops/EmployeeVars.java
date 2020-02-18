package com.mits.corejava.oops;

/**
 * @author mitsind759
 * creating object for EmployeeVars class
 *assigning valves to reference object 
 *printing employee details
 */
public class EmployeeVars {//declaring class
	// member data or instance variables
	String employeeId;
	String employeeName;
	double employeeSalary;

	public static void main(String[] args) {//declaring main
		// creating object
		EmployeeVars obj1 = new EmployeeVars();
		// assigning valves to reference object 
		obj1.employeeId = "mitsind759";
		obj1.employeeName = "JTejaswini";
		obj1.employeeSalary = 5000.0;
		// printing
		System.out.println("employee1 details........:");
		System.out.println("employeeId:" + obj1.employeeId);
		System.out.println("employeeName:" + obj1.employeeName);
		System.out.println("employeeSalary:" + obj1.employeeSalary);
		System.out.println("...........................................:");
		// creating another object
		EmployeeVars obj2 = new EmployeeVars();
		// assigning valves
		obj2.employeeId = "mitsind765";
		obj2.employeeName = "Chiranjeevi";
		obj2.employeeSalary = 5000.0;
		// printing
		System.out.println("employee2 details........:");
		System.out.println("employeeId:" + obj2.employeeId);
		System.out.println("employeeName:" + obj2.employeeName);
		System.out.println("employeeSalary:" + obj2.employeeSalary);
		System.out.println("...........................................:");

	}//end main

}//end class
