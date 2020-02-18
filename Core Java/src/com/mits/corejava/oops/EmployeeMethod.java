package com.mits.corejava.oops;

/**
 * @author mitsind759
 *Declaring instance variable with access modifier(private)
 *creating methods for set,display EmployeeDate
 */
public class EmployeeMethod {//declaring class
  // member data or instance variables
	private String empId;
	private String name;
	private double salary;
	//creating set method EmployeeDate
	public void setEmployeeData(String eId, String eName, double eSal) {
		//assign local variables with instance variables 
		empId = eId;
		name = eName;
		salary = eSal;

	}
	// creating display method EmployeeDate
	public void displayEmployeeDate() {
        System.out.println("EmpId " + empId);// print
		System.out.println("Name " + name);
		System.out.println("salary " + salary);

	}

}//end class
