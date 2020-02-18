package com.mits.corejava.collection;

import java.util.TreeMap;

public class DemonstrateTreeMap {
 @SuppressWarnings("unchecked")
public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	TreeMap tree=new TreeMap();
	tree.put("vamsi1",'v');
	tree.put("vamsi2", "tejaswini");
	tree.put("vamsi3", 5.9);
	System.out.println(tree);
	tree.put("vamsi4", "hyd");
	System.out.println("after add vamsi4........."+tree);
	tree.remove("vamsi1");
	System.out.println("after revoming vamsi1..."+tree);
    System.out.println("checking key vamsi3 contains "+tree.containsKey("vamsi3"));
}
}