package com.mits.corejava.collection;

import java.util.*;

/**
 * @author mitsind759
 *DemonstrateHashMap
 */
public class DemonstrateHashMap {//opening class

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {//main
		@SuppressWarnings("rawtypes")
		HashMap hash = new HashMap();//hash bject
		hash.put(1, "Tejaswini");//add
		hash.put(2.0, "vamsi");
		hash.put(4, "hari");
		hash.put('a', "chiru");
		System.out.println(hash);
		hash.put(2, "vamsi");
		System.out.println("after adding vamsi.................." + hash);
		hash.remove(4);//removing
		System.out.println("after removing key 4.................." + hash);
		hash.containsKey(2);//contains key 
		System.out.println("Using contains key  2........................" + hash);
		hash.containsValue("chiru");//contains value
		System.out.println("Using contains value   vamsi........................" + hash);
		hash.replace('a', "veeru");//contains key
		System.out.println("Using contains key   a........................" + hash);
		Object tmpVal = hash.get(1);
		String strVal = (String) tmpVal;
		System.out.println(" Key 1 : " + strVal);//print key
		String strVal1 = (String) hash.get('a');
		System.out.println(" Key 4 : " + " Value : " + strVal1);//printing key,value

		System.out.println("*******************************************");

	}//main

}//class
