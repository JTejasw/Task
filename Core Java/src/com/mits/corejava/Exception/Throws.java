package com.mits.corejava.Exception;

import java.io.IOException;

public class Throws {

	
		void method()throws IOException{  
			int data=50/0;  
			  throw new IOException("device error");  
			 }  
			  
			
			   public static void main(String args[]){  
				   Throws m=new Throws();  
			    try{  
			    	
			     m.method();  
			    }catch(Exception e){
			    	System.out.println("exception handled");
			    	}     
			  
			    System.out.println("normal flow..."); 
	}

}
