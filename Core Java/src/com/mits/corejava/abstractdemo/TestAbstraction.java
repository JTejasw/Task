package com.mits.corejava.abstractdemo;

/*abstract class Vehicle{  
	   void Bike(){
		   System.out.println("bike is created");
		   }  
	   abstract void run();  
	   void changeGear(){
		   System.out.println("gear changed");
		   }  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class Bike extends Vehicle{  
	 void run(){
		 System.out.println("running safely..");
		 }  
	 }  
	//Creating a Test class which calls abstract and non-abstract methods  
	 class TestAbstraction{  
	 public static void main(String args[]){  
		 Vehicle obj = new Bike();  
	       obj.run();  
	       obj.changeGear();  
	       obj.Bike();
	 }  
	}  */
interface A1{  
void a();  
void b();  
void c();  
void d();  
}  
  
 abstract class B1 implements A1{  
public void c(){
	System.out.println("I am c");}  
}  
  
class M extends B1{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
class TestAbstraction{  
public static void main(String args[]){  
A1 a=new M();  
a.a();  
a.b();  
a.c();  
a.d();  
}}  

