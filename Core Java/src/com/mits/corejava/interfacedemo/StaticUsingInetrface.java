package com.mits.corejava.interfacedemo;

interface Drawable {

	void draw();

	

	 static  int cube(int x) {
		return x * x * x;
	}
}


	
	class Circle implements Drawable {
		public void draw() {
			System.out.println("drawing Circle");
		}
	}

	public class StaticUsingInetrface { 
			public static void main(String args[]){  
				
				Circle d=new Circle();  
			         d.draw();  
			System.out.println(Drawable.cube(3));  
			

			} 
	}
	
/*
 * interface Drawable{ void draw(); default void msg(){System.out.println(
 * "default method");} } class Rectangle implements Drawable{ public void
 * draw(){System.out.println("drawing rectangle");} } class
 * StaticUsingInetrface{ public static void main(String args[]){ Drawable d=new
 * Rectangle(); d.draw(); d.msg(); } }
 * 
 */
/*interface printable{  
	 void print();  
	 interface MessagePrintable{  
	   void msg();  
	 }  
	}  
class Rectangle implements printable.MessagePrintable{

	public void print() {
		System.out.println("printing");
		
	}

	
	public void msg() {
		System.out.println("messing");
	}
	
}
public class StaticUsingInetrface { 
	public static void main(String args[]){  
		Rectangle objrect =new Rectangle();
		objrect.print();*/
 /*public interface StaticUsingInetrface {

	void draw();

	
default int cube(int x) {
		return x * x * x;
	}
}
  

	
 class Circle implements StaticUsingInetrface{
		public void draw() {
			System.out.println("drawing Circle");
		}

		@Override
		public int cube(int x) {
			// TODO Auto-generated method stub
			return .super.cube(x);
		}

	
		
	}

	 class StaticUsingInetr { 
			public static void main(String args[]){  
			Circle d=new Circle();  
			d.draw();  
			System.out.println(d.cube(3));  
			

			} 

	
	
	
	
	}*/