package com.mits.corejava.iostreams;
import java.io.*;
import java.util.Scanner;


public class Read {
	public static void main(String[] args) 
	{
	   @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	  
	    FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("C:\\Users\\mitsind759\\Desktop\\File\\text.txt", true);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		String name = " ";
		for(int i=0;i<=3;i++){
		 System.out.println("enter:");
	     name=sc.nextLine();
	    try {
	    	outputStream.write(name.getBytes());
			}
	    catch (IOException e) {
			
			e.printStackTrace();
		}}
		
	    try {
			outputStream.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	}
