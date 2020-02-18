package com.mits.corejava.collection;

import java.util.*;

public class ArrayListDiffObjects {//open class

	public static void main(String[] args) {//open main
		ArrayList objList = new ArrayList();//creating array object
		/*
		  System.out.println("List Size : "+objList.size());
		 System.out.println("List  : "+objList);
		 */

		String studName = new String("Ramesh");//creating string object
		objList.add(studName);
		
		String studName1 = new String("Teju");
		objList.add(studName1);
		
		Integer studId = new Integer(101);//creating integer object
		objList.add(studId);
		Double studFees = new Double(20000.50);//creating double object
		objList.add(studFees);//add method
		System.out.println("size method :" + objList.size());
		objList.add("Naresh");
		System.out.println("add addmethod using in sop :" + objList.add("vamsi"));
		System.out.println("addmethod:"+objList);
		objList.set(5, "chiru");//using set method
		System.out.println("set method using in sop:" + objList.set(3, "chiru"));
		System.out.println("set method:" + objList);
        objList.remove(5);//using remove method
		System.out.println("remove method using in sop:" + objList.remove(0));
		System.out.println("remove method:" + objList);
		
		objList.contains(studId);//using contains method
		System.out.println("Contains method using in sop: " + objList.contains(studName1));
        System.out.println("contains method:"+objList);
		Iterator listIterator = objList.iterator();//using Iterator
		System.out.println("Using.................. Iterator");
		while (listIterator.hasNext()) {

			Object tmpObj = listIterator.next();

			System.out.println(tmpObj);

		}
		System.out.println("using................... forLoop");
		for (int i = 0; i < objList.size(); i++) {//using for loop

			System.out.println(objList.get(i));
		}
		objList.clear();//using clear method
		//System.out.println("clear method using in sop: " + objList.clear());
        System.out.println("clear method:"+objList);
		
	}//end main

}//end class
