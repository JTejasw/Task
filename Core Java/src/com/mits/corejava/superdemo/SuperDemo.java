package com.mits.corejava.superdemo;
class A{
	int i=10;//instance variable
	A(int i){//creating constructor
		this.i=i;
		System.out.println("Parent class constructor");
	}
	void m1(){//creating method
		System.out.println("parent class method m1");
	}
	String m2(){//creating method with return
		
		return "parent class method m2";
	}
}
class B extends A{
	 String name;
	B(int i,String name) {//creating constructor
		super(i);
		this.name=name;
		System.out.println("child class constructor");
	}
	int i=20;//override variable
	void m1(){//override creating method
		System.out.println("child class method m1");
		System.out.println("child class variable:"+i);
		System.out.println("using super keyword form varible:"+(super.i));//super keyword for variable
	    super.m1();//super keyword for method
	    System.out.println("using super keyword form method:"+(super.m2()));//super keyword for method
	}
}
public class SuperDemo {

	public static void main(String[] args) {
	B obj =new B(30,"JTejaswini");
	obj.m1();
	
	}

}
