package com.mits.corejava.collection;

import java.util.*;

public class StudentComparator {// class declaration
	int id;// Initialization
	String name;
	int age;

	public StudentComparator(int id, String name, int age) {// constructor

		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {// to string
		return "StudentComparator [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}// close class
 class IdComparator implements Comparator<StudentComparator>{  

public int compare( StudentComparator id1, StudentComparator id2) {
			
			if(id1.id==id2.id){
				return 0;
			}
			if(id1.id>id2.id){
				return 1;
			}
			else
				return -1;
			}

}
 
 class NameComparator implements Comparator<StudentComparator>{  
	 public int compare(StudentComparator s1,StudentComparator s2){  
	 return s1.name.compareTo(s2.name); 
	 
	 }
	 
 }
 