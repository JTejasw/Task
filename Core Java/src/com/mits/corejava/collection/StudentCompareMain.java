package com.mits.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentCompareMain {//class open

	public static void main(String[] args) {//open main
		
 ArrayList<StudentComparator> al=new ArrayList<StudentComparator>();//array feild
	    al.add(new StudentComparator(4, "chiru", 23));//add in the list
	    al.add( new StudentComparator(3, "Avamsi", 24)); 
	    al.add(new StudentComparator(2, "teju", 20));
	   
	    Collections.sort(al,new IdComparator());//sorting based id
	   
		  

	    Iterator itr=al.iterator();//iterator method
	    while(itr.hasNext()){
	    	System.out.println("Id Comparision:"+itr.next());
	    }
	    Collections.sort(al,new NameComparator());//sorting based on name
	    itr=al.iterator();//iterator method
	    while(itr.hasNext()){
	    	System.out.println("Name Comparsion:"+itr.next());
	    }
	  
	}

}
