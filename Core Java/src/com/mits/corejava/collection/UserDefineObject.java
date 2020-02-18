package com.mits.corejava.collection;

import java.util.*;

public class UserDefineObject {

	public static void main(String[] args) {

		ArrayList objList = new ArrayList();
		
		Employee objStud = null;
		
		objStud = new Employee("101","Rakesh",23,"Hyderabad");
		objList.add(objStud);
	
		objStud = new Employee("102","Suresh",25,"Bangalore");
		objList.add(objStud);
		
		objStud = new Employee("103","Anand",21,"Mumbai");
	    objList.add(objStud);

		objStud = new Employee("104","Naresh",21,"Delhi");
		objList.add(objStud);
           
		
		System.out.println("Size : "+objList.size());
		System.out.println("employee Obj List : "+objList);
		
		
		Iterator studIter = objList.iterator(); //Get Iterator
		
		Employee tmpStudent = null;
		
		String tmpId = null;
		String tmpName = null;
		int tmpAge = 0;
		String tmpAddr = null;

		while(studIter.hasNext()){
		
			tmpStudent = (Employee)studIter.next(); //typecast to student object
			
			tmpId = tmpStudent.getId();
			tmpName = tmpStudent.getName();
			tmpAge = tmpStudent.getAge();
			tmpAddr = tmpStudent.getAddress();
					
			System.out.println("*****************************");		
			System.out.println(" Id : "+tmpId);
			System.out.println(" Name : "+tmpName);
			System.out.println(" Age : "+tmpAge);
			System.out.println(" Address : "+tmpAddr);
			System.out.println("*****************************");
			
			
			
		}
		
		
		
	
		
		
		
		
	
	}

}
