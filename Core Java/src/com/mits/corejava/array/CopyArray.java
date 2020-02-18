package com.mits.corejava.array;



public class CopyArray {

	public static void main(String[] args) {
		int[] original={1,2,3,4,5,6,7,8,9};
		System.out.println("original element");
		for(int i=0;i<original.length;i++){
			System.out.print(original[i]);
		}
	
		System.out.println("\ncopyed element");
	   int[] copy1=original;
	   for(int i=0;i<copy1.length;i++){
			System.out.print(copy1[i]);
		}
	}
}