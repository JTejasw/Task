package com.mits.corejava.constructor;
/**
 * @author mitsind759
 * creating parameterized constructor to pass input variables
 * creating method for Arithmetic Operations
 */
//class open
public class ArithmeticConstructors {
	private int num1;
	private int num2;
// creating parameterized constructor to pass input variables
	public ArithmeticConstructors(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	// add method
	public int add()
	{
		int add = num1 + num2;
		return add;
	}
	// sub method
	public int sub()
	{
		int sub = num1 - num2;
		return sub;
	}
	// mul method
	public int mul()
	{
		int mul = num1 * num2;
		return mul;
	}
	// div method
	public int div()
	{
		int div = num1 / num2;
		return div;
	}
}// end class
