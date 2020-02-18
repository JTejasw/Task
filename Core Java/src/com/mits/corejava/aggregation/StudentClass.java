package com.mits.corejava.aggregation;

class College {
	String collegeName;
	// Creating HAS-A relationship with Address class
	Address collegeAddr;

	College(String name, Address addr) {
		this.collegeName = name;
		this.collegeAddr = addr;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeAddr=" + collegeAddr + "]";
	}

}

class Staff {
	String employeeName;
	// Creating HAS-A relationship with Address class
	Address employeeAddr;

	Staff(String name, Address addr) {
		this.employeeName = name;
		this.employeeAddr = addr;
	}

	@Override
	public String toString() {
		return "Staff [employeeName=" + employeeName + ", employeeAddr=" + employeeAddr + "]";
	}

}

public class StudentClass {

	int rollNum;
	String studentName;
	// Creating HAS-A relationship with Address class
	Address studentAddr;

	StudentClass(int roll, String name, Address addr) {
		this.rollNum = roll;
		this.studentName = name;
		this.studentAddr = addr;
	}

	@Override
	public String toString() {
		return "StudentClass [rollNum=" + rollNum + ", studentName=" + studentName + ", studentAddr=" + studentAddr
				+ "]";
	}

	public static void main(String[] args) {
		Address objAddr = new Address(12, "hyderabed", "Telengana", "India", 500032);
		StudentClass objstu = new StudentClass(123, "Chaitanya", objAddr);
		System.out.println(objstu.toString());
		College objclg = new College("Gates", objAddr);
		System.out.println(objclg.toString());
		Staff objstaff = new Staff("JTejaswini", objAddr);
		System.out.println(objstaff.toString());
	}
}