package com.mits.corejava.file;

import java.io.*;

public class Employee {
	int employeeId;
	String employeeName;
	int employeeage;
    double employeeSalary;
    String address;
	public Employee() {
	}

	public Employee(int employeeId, String employeeName, int employeeage, double employeeSalary, String address) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeage = employeeage;
		this.employeeSalary = employeeSalary;
		this.address = address;
	}

	public void setEmployeedetails(int employeeId, String employeeName, int employeeage, double temsalary) {
		this.employeeId = employeeId;
		this.employeeage = employeeage;
		this.employeeName = employeeName;
		this.employeeSalary = temsalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public int getEmployeeage() {
		return employeeage;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public String getemp() {
		return  employeeId +"," + employeeage + ", " + employeeName
				+ "," + employeeSalary ;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeage=" + employeeage + ", employeeName=" + employeeName
				+ ", employeeSalary=" + employeeSalary + "]";
	}

}
