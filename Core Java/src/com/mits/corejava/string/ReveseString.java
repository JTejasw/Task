package com.mits.corejava.string;


import java.util.Scanner;

public class ReveseString {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name:");
		String enter= s.next();
		String reverse = " ";
		
		for(int i = enter.length() - 1; i >= 0; i--)
        {
            reverse = reverse + enter.charAt(i);
            
        }
		
		
        System.out.println("Reversed string using for loop:"+reverse);
       
        StringBuilder sb = new StringBuilder(enter);
        
		System.out.println("Reversed  using stringbuilder:"+sb.reverse());
		
		StringBuffer sb1 = new StringBuffer(enter);
        System.out.println("Reversed  using stringbufferr:"+sb1.reverse());
        
		
       
	}}