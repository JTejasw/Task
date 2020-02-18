package com.mits.corejava.collection;

import java.util.*;


public class TreeSetDiffObject {
	

	public static void main(String[] args) {
	
			TreeSet objSet = new TreeSet();
			
			String studName = new String("Ramesh");
			objSet.add(studName);
			
			String studName1 = new String("Ramesh");
			objSet.add(studName1);
			
			String studName2 = new String("suresh");
			objSet.add(studName2);
			/*
			Integer studId = new Integer(101);
			objSet.add(studId);*/
		/*	
			Double studFees = new Double(20000.50);
			objSet.add(studFees);
			*/
			System.out.println("size method :" + objSet.size());
			objSet.add("Naresh");
		    System.out.println("add method:"+objSet);
			
			//((Object) objSet).set(1, "chiru");
			objSet.remove(1);
			System.out.println("remove method:"+objSet);
			
			/*objSet.contains(studName1);
			System.out.println("contains method:"+objSet);
			*/
			/*Iterator it=objSet.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}*/
			
		/*	for(int i=0;i<objSet.size();i++){  
			    System.out.println(objSet.);  
			    }  */
			
			objSet.clear();
			System.out.println("clear method:"+objSet);
			
		}

	}


