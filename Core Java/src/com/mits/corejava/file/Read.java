package com.mits.corejava.file;
import java.io.*;
import java.util.Scanner;


public class Read {
	public static void main(String[] args)  
	{
	   @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	  
	    File f = new File("D:\\Employee.txt");
	    FileWriter fw=null;
		
			try {
				fw=new  FileWriter(f,true);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    String name = " ";
		for(int i=0;i<=3;i++){
		System.out.println("enter:");
		name=sc.nextLine();
	    try {
	      fw.write(name);
			}
	    catch (IOException e) {
			
			e.printStackTrace();
		}}
		 try {
		      fw.close();;
				}
		    catch (IOException e) {
				
				e.printStackTrace();
			}
		System.out.println("success");
	    
	}
	}
