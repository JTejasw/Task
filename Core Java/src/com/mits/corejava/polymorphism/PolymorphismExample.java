package com.mits.corejava.polymorphism;

 class Shape {
 public void draw(){
 System.out.println("drawing different shape");
 }
}
 class  Circle  extends Shape{
 
	 public void draw() {
	 System.out.println("drawing Circle shape");
       }
 }
    class  Triangle  extends Shape{
	 public void draw() {
		 System.out.println("drawing Triangle shape");
	 }
    }
 class  Rectangle  extends Shape{
		 public void draw() {
			 System.out.println("drawing Rectangle shape");
		 }
 }
 public  class PolymorphismExample {
 
	  public static  void main(String[] args) {
		    
		Shape obj;
		obj=new Circle();
		
		obj.draw();
		obj=new Rectangle();
		obj.draw();
		
	}
 }
 
 
 
 

