package com.mits.corejava.polymorphism;

public class StudentP extends Person{
String program;
int year;
double fee;
public StudentP(String name, String address, String program, int year, double fee) {
	super(name, address);
	this.program = program;
	this.year = year;
	this.fee = fee;
}
public void setProgram(String program) {
	this.program = program;
}
public String getProgram() {
	return program;
}

public void setYear(int year) {
	this.year = year;
}

public int getYear() {
	return year;
}

public void setFee(double fee) {
	this.fee = fee;
}

public double getFee() {
	return fee;
}



@Override
public String toString() {
	return "StudentPerson [program=" + program + ", year=" + year + ", fee=" + fee + ", name=" + name + ", address="
			+ address + "]";
}








}
