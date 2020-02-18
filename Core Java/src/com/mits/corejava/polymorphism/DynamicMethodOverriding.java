package com.mits.corejava.polymorphism;

class c1{
	public void m1(){
		System.out.println("super class m1 in class c1");
	}
	public void m2(){
		System.out.println("super class m2 in class c1");
	}
	
}
 class c2 extends c1{
	 public void m1(){
			System.out.println("sub class m1 in class c2");
		} 
	public void m3(){
			System.out.println("super class m2 in class c1");
		}
	
}
 class c3 extends c1{
	 public void m1(){
			System.out.println("sub class m1 in class c3");
		} 
}
public class DynamicMethodOverriding {

	public static void main(String[] args) {
	   c1 objc1 =new c1();//super class m1 in class c1
	  
	   objc1.m1();
	   c2 objc2 =new c2(); //sub class m1 in class c2,  
	   objc2.m1();
	   c3 objc3 =new c3(); //sub class m1 in class c3
	   objc3.m1();
	   c1 obj4 =new c2();
	   obj4 .m1();//sub class m1 in class c2  , super class m2 in class c1
	   obj4.m2();
	   c1 obj5 =new c3();
	   obj5.m1();//sub class m1 in class c3
	   c1 obj6 =new c2();
	   obj6.m1();
	   obj6.m2();

	}

}
