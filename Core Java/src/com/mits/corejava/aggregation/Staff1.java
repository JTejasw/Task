package com.mits.corejava.aggregation;

public class Staff1 {
	String employeeName;
	   //Creating HAS-A relationship with Address class
	   Address employeeAddr; 
	   Staff1(String name, Address addr){
	       this.employeeName = name;
	       this.employeeAddr = addr;
	   }
	@Override
	public String toString() {
		return "Staff [employeeName=" + employeeName + ", employeeAddr=" + employeeAddr + "]";
	}
	public static void main(String[] args) {
		Address objAddr = new Address(12, "hyderabed", "Telengana", "India", 500032);
		
		Staff1 objstaff = new Staff1 ("JTejaswini", objAddr);
		System.out.println(objstaff.toString());

	}
}
