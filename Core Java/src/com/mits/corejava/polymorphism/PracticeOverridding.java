package com.mits.corejava.polymorphism;

 class A {
	 public void m1(){
			System.out.println("m1 super class");
		}

}

public class PracticeOverridding extends A {
 public void m1(){
	 System.out.println("m1 subr class");
	}

	public static void main(String[] args) {
		PracticeOverridding obj =new PracticeOverridding();
		obj.m1();
	}

}
