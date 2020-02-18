package com.mits.corejava.Exception;

/**
 * @author mitsind759
 *TryFinally block
 */
public class TryFinally {//class declaration

	public static void main(String[] args) {//main declaration
		     try{  //TryFinally block
			   int data=25/0;  
			   System.out.println(data);  
			  }  
			
			  finally{
			  System.out.println("finally block is always executed");
			  }  
			  System.out.println("rest of the code...");  
	
	}//closing main
}//closing class


