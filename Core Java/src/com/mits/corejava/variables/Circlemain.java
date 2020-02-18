package com.mits.corejava.variables;

import java.util.Scanner;//importing scanner object

public class Circlemain {//declaring class

	public static void main(String[] args) {//declaring main
		@SuppressWarnings("resource")
		Scanner objsacnner = new Scanner(System.in);//creating scanner object
        System.out.println("Enter the radius: ");//taking input value radius
		double radius =objsacnner.nextDouble();
		System.out.println("Area of The circle:"+Circle.area(radius));//print Area of The circle
	
		System.out.println("Enter the radius in integer: ");//taking input value radius
		int radius1 =objsacnner.nextInt();
		System.out.println("Perimeter of The circle:"+Circle.Perimeter(radius1));//print Perimeter of The circle

	}//ending main

}//ending class
