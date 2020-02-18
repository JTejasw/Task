package com.mits.corejava.collection;

import java.util.*;

/**
 * @author mitsind759
 * Write a program to display all System properties
 */
public class SystemProperties {//open class

	public static void main(String[] args) {
		Properties p=System.getProperties();//Properties  class
		/*p.list(System.out);*/
       Set set=p.entrySet(); 
        Iterator itr=set.iterator();//using iterator
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();  //map.entry using to get both key and value
        	System.out.println(entry.getKey()+"......"+entry.getValue());//print
        }
	}//end main

}//end class
