package com.mits.corejava.collection;

import java.util.*;

/**
 * @author mitsind759
 * demonstrate Comparable 
 *
 */
public class DemonstrateComparable implements Comparable<DemonstrateComparable>{//class open
   int id;//Initialize variables
   String name;
   int age;
   double salary;
public DemonstrateComparable(int id, String name, int age, double salary) {//creating construter
	
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
}

public int compareTo(DemonstrateComparable employee) {//using Comparable 
	if(id==employee.id)
	return 0;
	if(id>employee.id)
		return 1;
	else
		return -1;
}


@Override
public String toString() {//to string
	return "DemonstrateComparable [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
}

public static void main(String[] args) {//main
	DemonstrateComparable ds=null;
	ArrayList<DemonstrateComparable> al=new ArrayList<DemonstrateComparable>();//using list
	
	al.add(new DemonstrateComparable(2,"tejaswini",21,50000));//adding list
    al.add(new DemonstrateComparable(1,"vamsi",23,52000));
	al.add(new DemonstrateComparable(3,"chiru",25,58000));
	Collections.sort(al); //sorting
	
	for(DemonstrateComparable st: al){ //for each 
		System.out.println(st);  //print
		}  
	
	}//end main



}//end class
