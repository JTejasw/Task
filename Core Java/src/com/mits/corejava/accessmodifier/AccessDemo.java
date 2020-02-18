package com.mits.corejava.accessmodifier;

public class AccessDemo {
	
	private void m1(){
		System.out.println("private method");
	}
       void m2(){
		System.out.println("deafult method");
	}
	protected void m3(){
		System.out.println("protected method");
	}
	public void m4(){
		System.out.println("public method");
	}
    public static void main(String[] args) 
    {
    	AccessDemo objaccess =new AccessDemo();
    	objaccess.m1();//with in a class private
    	objaccess.m2();
    	objaccess.m3();
    	objaccess.m4();
	}
}
