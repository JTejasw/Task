package com.mits.corejava.constructor;
/**
 * @author mitsind759
 * creating parameterized constructor
 *creating setEmployeeAddress  ,getEmployeeAddress method using for change address
 *creating method getEmployeeDetails method 
 */
public class EmployeeConstructors {//declaring class
	private int employeeId; //instance variable with private access modifier
	private String employeeName;
	private double employeeSalary;
	private String employeeAddress;
   //creating  parameterized constructor
	EmployeeConstructors (int employeeId,String employeeName,double employeeSalary, String employeeAddress){
		this.employeeId =employeeId;//assign local variables with instance variables 
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAddress=employeeAddress;
		
	}
	//creating setEmployeeAddress method 
	public void  setEmployeeAddress(String employeeAddress){
		//assign local variables with instance variables 
		this.employeeAddress=employeeAddress;
	}
	//creating getEmployeeAddress method 
	public String  getEmployeeAddress(String employeeAddress){
		return employeeAddress;
	}
	//creating getEmployeeDetails method 
	public String  getEmployeeDetails(){
		return "\nEmployeeId: "+employeeId+"\nEmployeeName:"
				+employeeName+"\nEmployee Salary:"+employeeSalary+"\nEmployeeAdress:"+employeeAddress;
	}
}//end class
