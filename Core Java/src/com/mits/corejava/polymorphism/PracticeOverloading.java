package com.mits.corejava.polymorphism;
 

public class PracticeOverloading  {
	public int add(int a,int b){
		 return a+b;
		 
	 }
	 public double add(double a,double b){
		 return a+b;
		 
	 }
	 public String add(String a,String b,String c){
		 return a+b+c;
		 
	 }
 
public static void main(String[] args) {
	PracticeOverloading obj =new PracticeOverloading();
	System.out.println("int a,int b:"+obj.add(2.5, 3));
	System.out.println("int a,double b:"+obj.add(2, 3.5));
	System.out.println("int a,int b,int c:"+obj.add("a", "b","c"));
	System.out.println("double a,double b:"+obj.add(2.8, 3.9));


	}

}
