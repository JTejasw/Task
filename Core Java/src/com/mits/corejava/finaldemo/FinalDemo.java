package com.mits.corejava.finaldemo;

public class FinalDemo {
final String str ="final variable cannot change";
  final void m1(){
	  System.out.println("final method cannot override it");
    }
  
//String str ="final variable ";//we cannot change the value
 //final void m1(){
	 // System.out.println("you cannot override it");//you cannot override it.
// }
 final class A {
	 void run(){
		 System.out.println("final class cannot override cannot be print");
		 }  
	 }
     
	  
  
  
  
  
  
public static void main(String[] args) {
		FinalDemo obj =new FinalDemo();
		System.out.println(obj.str);//we can print 
		obj.m1();//we can print 
		  
		
	}

}
