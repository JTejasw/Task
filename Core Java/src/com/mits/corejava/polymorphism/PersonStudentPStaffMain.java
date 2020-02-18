package com.mits.corejava.polymorphism;

public class PersonStudentPStaffMain {

	public static void main(String[] args) {
		StudentP objstudent =new StudentP("Tejaswini", "mits", "c", 2019, 5000);
		System.out.println(objstudent);
		objstudent.setName("teju");
	    objstudent.setAddress("Andhra predesh");
	    objstudent.setProgram("AI");
	    System.out.println(objstudent.getProgram());
        System.out.println(objstudent);
        Staff objstaff = new Staff("lucky", "guntakal","goverment ", 0.0);
        System.out.println(objstaff);
	}

}
