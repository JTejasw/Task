package com.mits.corejava.variables;

/**
 * @author mitsind759
 * Circle - area, perimeter
 */
public class Circle {//delaring class
	static double pi = Math.PI;//declaring  pi  value

	public static double area(double radius) {//using  area perimeter method
		double area = Circle.pi * Math.pow(radius, 2);//( (A = π r²)
		return area;
	}

	public static double Perimeter(int radius1) {//using perimeter method
		double perimeter = Circle.pi * Math.multiplyExact(radius1, 2);//(Pi x (2 x radius))
		return perimeter;

	}

}//ending class
