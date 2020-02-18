package com.mits.corejava.oops;

/**
 * @author mitsind759
 *Creating Object EmployeeVars  class
 *,set and display employee details with reference object
 */
public class EmployeeVarsMain {
	
	public static void main(String[] args) {
		
		
		//Creating Object
		EmployeeVars obj1 = new EmployeeVars();
		
		//set data
		obj1.employeeId= "MITSIND301";
		obj1.employeeName =  "Uma";
		obj1.employeeSalary = 10000;
		//display employee details
		System.out.println("Employee 1*******************");
		System.out.println("Emp Id: "+obj1.employeeId);
		System.out.println("Emp Name: "+obj1.employeeName);
		System.out.println("Emp Salary: "+obj1.employeeSalary);
		System.out.println("*******************");
		System.out.println("Employee 2*******************");
		//Creating Object another object
		EmployeeVars obj2 = new EmployeeVars();
		//set data
		obj2.employeeId = "MITSIND450";
		obj2.employeeName =  "Raj";
		obj2.employeeSalary = 20000;
		//display employee details
		System.out.println("Emp Id: "+obj2.employeeId);
		System.out.println("Emp Name: "+obj2.employeeName);
		System.out.println("Emp Salary: "+obj2.employeeSalary);
		System.out.println("Employee 2*******************");
		
     }//end main


}//end class
