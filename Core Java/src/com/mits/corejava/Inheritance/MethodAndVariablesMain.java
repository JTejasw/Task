package com.mits.corejava.Inheritance;



public class MethodAndVariablesMain {

	public static void main(String[] args) {
	  
	  int a1=MethodsAndVariablesSubClass.a;
	  MethodsAndVariablesSubClass a= new MethodsAndVariablesSubClass();
	 
	  int b1=a.b;
	  int c1=MethodsAndVariablesSubClass.c;
	  int d1=a.d;
	  
		
		
		System.out.println("Addition of two numbers: " +MethodsAndVariablesSubClass.add(a1,d1));
		MethodsAndVariablesSubClass objinheritance =new MethodsAndVariablesSubClass();
	    System.out.println("Substraction of two numbers: " + objinheritance.sub(a1, b1));
	   System.out.println("multiplication of two numbers: "+objinheritance.mul(c1, d1));
	   System.out.println("Division of two numbers: "+MethodsAndVariablesSubClass.div(c1, d1));
		
	}

}
