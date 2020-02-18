package com.mits.corejava.collection;

import java.util.*;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList objList = new ArrayList();//craeting arraylist object
		System.out.println("List Size : " + objList.size());
		System.out.println("List  : " + objList);

		objList.add("Ramesh");//adding object to list
		objList.add("Anand");
		objList.add("Kiran");
		objList.add("Naresh");
		objList.add("Amar");

		System.out.println("List Size : " + objList.size());//print 
		System.out.println("List  : " + objList);

		Iterator listIterator = objList.iterator();
		while (listIterator.hasNext()) {//using iterator

			Object tmpObj = listIterator.next();
			// String tmpName = (String)tmpObj;

			System.out.println(tmpObj);

		}
		System.out.println("*************************************************");

		for (int i = 0; i < objList.size(); i++) {//using for loop

			// String tmpName = (String)objList.get(i);
			System.out.println(objList.get(i));
		}

	}//Closing main

}//closing class
