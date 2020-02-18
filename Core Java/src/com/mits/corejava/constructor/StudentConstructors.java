package com.mits.corejava.constructor;

/**
 * @author mitsind759
 *declaring  instance variables  with private access modifier
 *creating parameterized constructor with different argument
 *print output main method creating getStudentDetails method
 */
public class StudentConstructors {//open class
	//declaring  instance variables  with private access modifier
	private int studentId;
	private String studentName;
	private String collegeName;
	private int age;
	//creating parameterized constructor 
/* public StudentConstructors(){ 
	  studentId=0; 
	  studentName=" "; 
	  collegeName=" "; 
	  age=0;
	  
	  }*/
	//creating parameterized constructor 
    public StudentConstructors() {
		System.out.println("in StudentConstructor class parameterized constucutor");
		studentId = 1;
		studentName = "JTejaswini";
		collegeName = "Gate's Insititute of Technology ";
		age = 21;

	}
//creating parameterized constructor with emp id argument
	public StudentConstructors(int studentId) { 
		this.studentId = studentId;// this refers class level variable with instance variable
	}
	//creating parameterized constructor with emp id,name argument
	public StudentConstructors(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	//creating parameterized constructor with emp id,name,college name argument
	public StudentConstructors(int studentId, String studentName, String collegeName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.collegeName = collegeName;
	}
	//creating parameterized constructor with emp id,name,college name ,age argument
	public StudentConstructors(int studentId, String studentName, String collegeName, int age) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.collegeName = collegeName;
		this.age = age;

	}
	// creating getStudentDetails method
	public String getStudentDetails() {
		return studentId + "\t" + studentName + "\t" + collegeName + "\t" + age;
	}
}//end class
