package com.mits.corejava.constructor;
/**
 * @author mitsind759 
 * creating object EmployeeConstructors class passing values parameterized constructor
 * calling display method print output
 * calling setEmployeeAddress method to update the salary
 * EmployeeDetails method print output
 */
public class EmployeeConstructorsMain {// open class

	public static void main(String[] args) {// open method
		// creating parameterized EmployeeConstructors  to initialize values
		EmployeeConstructors employeeobj = new EmployeeConstructors(100, "JTejaswini", 200000,
				"MITS|RMN House,#8-2-684/j/3/A,Bhavani Nagar, Road No:12,Banjara Hills,Hyd-500034,India.");
		// calling EmployeeDetails method print output
		System.out.println("Employee details :" + employeeobj.getEmployeeDetails());
		System.out.println("updating address for the employee with empId 100");
		 // calling setEmployeeAddress method to update the salary
		employeeobj.setEmployeeAddress("20/154,Housing Board Colony,Guntakal,Anantapure,pin.no:515801");
		// calling EmployeeDetails method print output
		System.out.println("Employee details after changing address: " + employeeobj.getEmployeeDetails());
	}//end main

}//end class
