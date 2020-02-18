package com.mits.corejava.aggregation;


public class Employee {
	String employeeId;
	String Name;
	Address employeeAddress;
public Employee(String employeeId, String name, Address employeeAddress) {
		
		this.employeeId = employeeId;
		Name = name;
		this.employeeAddress = employeeAddress;
	}


	

	@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", Name=" + Name + ", employeeAddress=" + employeeAddress + "]";
}




	public static void main(String[] args) {
		Address objAddr=new Address(12, "hyderabed", "Telengana", "India", 500032);
		Employee objEmployee =new Employee("Mitsind759", "JTejaswini", objAddr);
	    System.out.println(objEmployee.toString());
	    System.out.println(objEmployee.employeeAddress.streeNum);
	    System.out.println(objEmployee.employeeAddress.city);
	    System.out.println(objEmployee.employeeAddress.state);
	    System.out.println(objEmployee.employeeAddress.country);
	    System.out.println(objEmployee.employeeAddress.pincode);
	    System.out.println(objEmployee.Name);
	    System.out.println(objEmployee.employeeId);
	    System.out.println(objEmployee.employeeAddress);
	  
		
	}

}
