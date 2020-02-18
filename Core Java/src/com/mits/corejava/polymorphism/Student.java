package com.mits.corejava.polymorphism;

import java.util.Scanner;

public class Student {
String name;
int age;
String address;
Student(){
}
public String setinfo(String name){
	return name;
	
}
public String setinfo(String name,int age){
	return name+"\t"+age;
	
}
public String setinfo(String name,int age,String address){
	return name+"\t"+age+"\t"+address;
	
}
public String display(String name,int age,String address){
	return name+"\t"+age+"\t"+address;
	
}
	public static void main(String[] args){
		Student objstudent =new Student();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		String name = sc.nextLine();
		System.out.println("enter your age:");
		int age = sc.nextInt();
		System.out.println("enter your address:");
		sc.nextLine();
		String address = sc.nextLine();
	 
		
		System.out.println(objstudent.setinfo(name));
		System.out.println(objstudent.setinfo(name, age));
		System.out.println(objstudent.setinfo(name, age, address));
		System.out.println(objstudent.display(name, age, address));
		
		
		
		
	}
}
