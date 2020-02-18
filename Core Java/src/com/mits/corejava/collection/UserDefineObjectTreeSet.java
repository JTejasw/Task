package com.mits.corejava.collection;

import java.util.*;
import java.util.Iterator;

public class UserDefineObjectTreeSet {
	public static void main(String[] args) {
		
	TreeSet<EmployeeTreeSet> objSet=new TreeSet<EmployeeTreeSet>();  
	
	
	EmployeeTreeSet objStud = null;
	
	objStud = new EmployeeTreeSet(106,"Rakesh",23);
	objSet.add(objStud);

	objStud = new EmployeeTreeSet(102,"Suresh",25);
	objSet.add(objStud);
	
	objStud = new EmployeeTreeSet(101,"Anand",21);
    objSet.add(objStud);

	objStud = new EmployeeTreeSet(108 ,"Naresh",21);
	objSet.add(objStud);
       
	
	System.out.println("Size : "+objSet.size());
	System.out.println("employee Obj List : "+objSet);
	
	/*
	Iterator studIter = objSet.iterator(); //Get Iterator
	
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
		
	}	*/
	 for (EmployeeTreeSet e : objSet) {
         System.out.println(e);
     }
	}	
}
