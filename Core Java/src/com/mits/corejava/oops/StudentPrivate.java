package com.mits.corejava.oops;

/**
 * @author mitsind759
 *declaring  instance variables  with private access modifier
 *Those can be access by using methods
 */
public class StudentPrivate {// declaring class
	// declaring  instance variables  with private access modifier
	private String rollNo;
	private String name;
	private double marks;
public void setDetails(String rollNo, String Name, double Marks) {// creating  set method
	// setting variables																
	   this.rollNo = rollNo;
		name = Name;
		marks = Marks;
}// end set method
public void getDetails() {// creating get method
	    // print
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(marks);

	}// end get method
}//// end class
