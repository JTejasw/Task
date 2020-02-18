package com.mits.corejava.oops;

/**
 * @author mitsind759
 *Creating Object EmployeeVars  class
 *set and display Student1 details with reference object
 */
public class StudentDemo {// open class

	public static void main(String[] args) {// open main
		// creating object
		Student obj1 = new Student();
		// assign values to variables
		obj1.rollNo = "mitsind759";
		obj1.name = "JTejasawini";
		obj1.marks = 600;
		//display Student1 details
        System.out.println("Student1 details........:");
		System.out.println("Student1Id:" + obj1.rollNo);
		System.out.println("Student1Name:" + obj1.name);
		System.out.println("Student1Markes:" + obj1.marks);
		System.out.println("...........................................:");
        // creating another object
		Student obj2 = new Student();
		// assign values to variables
		obj2.rollNo = "mitsind765";
		obj2.name = "Chiru";
		obj2.marks = 600;
		//display Student2 details
		System.out.println("Student2 details........:");
		System.out.println("Student1Id:" + obj2.rollNo);
		System.out.println("Student1Name:" + obj2.name);
		System.out.println("Student1Markes:" + obj2.marks);
		System.out.println("...........................................:");

	}// end main

}// end class
