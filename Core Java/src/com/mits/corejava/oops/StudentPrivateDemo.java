package com.mits.corejava.oops;
/**
 * @author mitsind759
 * creating object
 * calling set,get method print Student details
 */
public class StudentPrivateDemo {// open class

	public static void main(String[] args) {// open main
		// creating object StudentPrivate class
		StudentPrivate obj = new StudentPrivate();
		// creating object calling set method assign variables
		obj.setDetails("Mitsind759", "Jtejaswini", 90);
		// calling get method print output
		obj.getDetails();
		// creating object
        StudentPrivate obj1 = new StudentPrivate();
        // calling set method assign variables
		obj1.setDetails("Mitsind765", "Chiru", 110);
		// calling get method print output
		obj1.getDetails();
		// creating another object
		StudentPrivate obj2 = new StudentPrivate();
		// calling set method assign variables
		obj2.setDetails("Mitsind775", "RajuKumar", 80);
		// calling get method print output
		obj2.getDetails();

	}// end main

}// end class
