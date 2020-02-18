package com.mits.corejava.wrapperclass;

/**
 * @author mitsind759
 * Writing a Java Program to demonstrate Wrapper Classes. 
 * Conversions of primitive datatypes to  its  wrapper class object and vice versa (wrapping and unwrapping)
 * Wrapper Class (From Java5) - Write sample programs on  Autoboxing and Unboxing 
 */
public class WrapperDemo {// class declaration

	public static void main(String[] args) {// main declaration
		char c = 'A';//primitive datatypes to  its  wrapper class :
		Character ch = new Character(c);
		System.out.println("primitive datatypes to  its  wrapper class :" + ch);

		Character ch1 = new Character('a');//wrapper class to its primitive datatypes
		char c1 = ch1.charValue();
		System.out.println("wrapper class to its primitive datatypes  :" + c1);

		boolean b = true;//Autoboxing
		Boolean b1 = new Boolean(b);
		System.out.println("Autoboxing :" + b1);

		Boolean b2 = new Boolean(b);//Unboxing 
		boolean b3 = b2.booleanValue();
		System.out.println("unboxing :" + b3);

	}// closing main
}// closing class




