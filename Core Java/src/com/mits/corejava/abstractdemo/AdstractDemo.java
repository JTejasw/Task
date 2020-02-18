package com.mits.corejava.abstractdemo;
/**
 * @author mitsind759
 *
 */
abstract class A{
	public int add(int a,int b){
		return a+b;
	}
         abstract int sub(int a ,int b);
   }


    class B extends A{

	
	int sub(int a ,int b) {
		
		return a-b;
	}
}
public class AdstractDemo {

	public static void main(String[] args) {
		A objA= new B();
	   System.out.println("addition:"+objA.add(2, 3));
	   System.out.println("substraction:"+objA.sub(2, 5));
		

	}

}
