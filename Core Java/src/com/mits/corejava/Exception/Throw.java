package com.mits.corejava.Exception;

public class Throw {

	static void validate(int age){  
		     if(age>18){  
		    	 System.out.println("welcome to vote");
		    	 }  
		     else  {
		    	 throw new ArithmeticException("not valid");
		    	 }  
		   }  
		   public static void main(String args[]){  
		      validate(18);  
		      System.out.println("rest of the code...");  

	}

}
