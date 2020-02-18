package com.mits.corejava.collection;

import java.util.*;

public class SortCollections {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		 // Create a list of strings 
		 ArrayList al = new ArrayList(); 
		    al.add("e"); 
	        al.add("b"); 
	        al.add("c"); 
	        al.add("a"); 
	        al.add("d"); 
       
        
        /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        //Collections.sort(al, Collections.reverseOrder()); //it is void so we cannot use in sop
	        Collections.sort(al);
        // Let us print the sorted list 
       System.out.println("List after the use of" + 
               " Collection.sort() :\n" + al); 
       Collections.reverse(al);
       System.out.println("List after the use of" + 
               " Collection.reverse() :\n" + al); 
	}

}
