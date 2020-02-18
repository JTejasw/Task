package com.mits.corejava.variables;

public class StaticVariableMain {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		System.out.println("Print counter without creating object" + StaticVariable.counter);

		StaticVariable.counter = 200;// Changing using class
		System.out.println("Print counter without creating object" + StaticVariable.counter);
		
		StaticVariable obj = new StaticVariable();// changing using object
		obj.counter = 200;
		
		System.out.println("Print counter without creating object" + obj.counter);
		StaticVariable.counter = 300;
		//obj.counter = 200;
		System.out.println("Print counter without creating object" + obj.counter + StaticVariable.counter);
		
	}

}
