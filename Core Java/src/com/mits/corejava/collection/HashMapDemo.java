package com.mits.corejava.collection;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
     HashMap objMap = new HashMap();
		
		objMap.put(103, "Rakesh"); //Integer, String
		objMap.put(101, "Nag");
		objMap.put(105, "Mahi");
		
		System.out.println(objMap);
		

		Object tmpVal = objMap.get(101);
		String strVal = (String)tmpVal;
		

		
		System.out.println(" Key 101 : "+" Value : "+strVal);
		strVal = (String)objMap.get(103);
		System.out.println(" Key 103 : "+" Value : "+strVal);
		
		objMap.put(102, "John");
		System.out.println(objMap);		
		
		objMap.remove(101);
		System.out.println(objMap);

		System.out.println(objMap.containsKey(102));
		
		System.out.println("*******************************************");
		
		Set keys = objMap.keySet();
		Iterator iter = keys.iterator();
		
		Integer tmpKey = null;
		String tmpValue = "";
		
		while(iter.hasNext()) {
			
			tmpKey = (Integer)iter.next();
			
			tmpValue = (String)objMap.get(tmpKey);
			
			System.out.println(tmpKey+"\t"+tmpValue);
			
		}
	}

}
