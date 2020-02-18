package com.mits.corejava.Inheritance;

public class MethodsAndVariablesSuperClass {
	static int a =2;
	int b=3;
	public static int add(int a, int b)
	{
		int add = a +b;
		return add;
	}
	// sub method
	public int sub(int a, int b)
	{
		int sub = a- b;
		return sub;
	}
	
	public static void main(String[] args) {
		System.out.println("super");
	} 

}
