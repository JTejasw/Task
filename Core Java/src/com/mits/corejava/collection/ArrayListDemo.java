package com.mits.corejava.collection;

import java.util.*;

public class ArrayListDemo {
public static void main(String[] args) {
		
		ArrayList objList = new ArrayList();
		
		
		objList.add("Ramesh");
		objList.add("Anand");
		objList.add("Kiran");
		
		System.out.println("List Size : "+objList.size());
		System.out.println("List  : "+objList);
		
	//	Object tmpObject = objList.get(2);
	//	String tmpNa = (String)tmpObject;
		
		String tmpName = (String)objList.get(1);
		
		System.out.println("List 2nd element : "+tmpName);
		
		objList.add("Naresh");
		objList.add("Amar");
		
		System.out.println("List Size : "+objList.size());
		System.out.println("List  : "+objList);		
		
		objList.remove(3);
		System.out.println("List Size : "+objList.size());
		System.out.println("List  : "+objList);	
		
		objList.remove("Anand");
		System.out.println("List Size : "+objList.size());
		System.out.println("List  : "+objList);	


		System.out.println("objList.contains() : "+objList.contains("Ramesh"));
		
		objList.set(0,"Sushant");
		System.out.println("List Size : "+objList.size());
		System.out.println("List  : "+objList);	
		
		

	}
}
