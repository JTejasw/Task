package com.mits.corejava.Inheritance;

public class MethodsAndVariablesSubClass extends MethodsAndVariablesSuperClass{
	
	static int c=4;
	int d=3;
	public int mul(int c, int d)
	{
		int mul = c * d;
		return mul;
	}
	// div method
	public  static int div(int c, int d)
	{
		int div = c /d;
		return div;
	}

}
