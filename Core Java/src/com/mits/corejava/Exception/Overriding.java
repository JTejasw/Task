package com.mits.corejava.Exception;

import java.io.IOException;

class A {
	public void m1() {
		System.out.println("m1 super class");
	}
    void m2() throws Exception
	    { 
	        System.out.println("m2 SuperClass"); 
	        throw new Exception("dfh");
	    } 
	 /*void m3() throws ArithmeticException  
	    {
		 System.out.println("m3 SuperClass"); 
		  int i=1/0;
	    
	    }*/
	        
	   
}

public class Overriding extends A {

	public void m1()  {//super class doesn't contain any exception then child class provide  only unchecked exceptions
		System.out.println("m1 subr class");
		int div=2/0;
		}
	void m2() throws Exception
       {  System.out.println("m2 SubClass"); 
       throw new  Exception("SuperClass declares an exception, then the SubClass can only declare the child\n exceptions of the exception declared by \nthe SuperClass, but not any other exception");
      }
	/*public void m2()throws ArithmeticException  {//super class doesn't contain any exception 
			System.out.println("m1 subr class");
			int div=2/0;
			}*/
	void m3() 
    { 
	        System.out.println("m3 SubClass"); 
    } 
	  
  

	public static void main(String[] args) {

		Overriding obj = new Overriding();
		
		
			 try {
				
			
				try { 
			        obj.m1(); 
			       
			    } catch (ArithmeticException  e) { 
			        System.out.println("m1 sub class exception handle:"+e);
			        
			    } 
				obj.m2();
			 } catch (Exception e) {
				
				System.out.println(e);
			} 
		       
	   
		
		
		System.out.println("rest of the code in main method");
	}
	
	}

