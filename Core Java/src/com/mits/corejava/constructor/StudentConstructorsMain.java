package com.mits.corejava.constructor;

/**
 * @author mitsind759
 * creating object parameterized constructor passing different argument
 *print output by invoking getStudentDetails method
 */
public class StudentConstructorsMain {//open class

	public static void main(String[] args) {//open main
		StudentConstructors objstudent = new StudentConstructors();//creating object
		//print output by invoking getStudentDetails method
		System.out.println("Data for default constructor: " + objstudent.getStudentDetails());
		//creating object parameterized constructor passing student id 
		StudentConstructors objstudent2 = new StudentConstructors(1);
		//print output by invoking getStudentDetails method
		System.out.println("parameterized constructor with Student id : " + objstudent2.getStudentDetails());
		//creating object parameterized constructor passing student id ,student name
		StudentConstructors objstudent3 = new StudentConstructors(1, "JTejaswini");
		//print output by invoking getStudentDetails method
		System.out.println(
				"parameterized constructor with Student id and Student name: " + objstudent3.getStudentDetails());
		//creating object parameterized constructor passing student id ,student name,student college
		StudentConstructors objstudent4 = new StudentConstructors(1, "JTejaswini", "Gate's Insititute of Technology ");
		//print output by invoking getStudentDetails method
		System.out.println(
				"parameterized constructor with Student id and Student college: " + objstudent4.getStudentDetails());
		//creating object parameterized constructor passing student id ,student name,student college,Student age
		StudentConstructors objstudent5 = new StudentConstructors(1, "JTejaswini", "Gate's Insititute of Technology ",
				21);
		//print output by invoking getStudentDetails method
		System.out.println("parameterized constructor with Student id and Student college,Student age "
				+ objstudent5.getStudentDetails());

	}//end main

}//end class
