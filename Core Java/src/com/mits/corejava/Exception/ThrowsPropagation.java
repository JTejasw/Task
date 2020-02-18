package com.mits.corejava.Exception;

import java.io.IOException;

public class ThrowsPropagation {

	void m()throws IOException{  
		int data=50/0;  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){
		   System.out.println("exception handled div by 0");
		   } 
	  }  
	  public static void main(String args[]){  
		  ThrowsPropagation obj=new ThrowsPropagation();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  

}
