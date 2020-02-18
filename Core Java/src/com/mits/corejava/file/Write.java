package com.mits.corejava.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
	public static void main(String args[]){   
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter:");
	     String name=sc.nextLine();
	     FileWriter fw=null;
        try{    
           fw=new FileWriter("D:\\test3.txt");    
          fw.write((name));    
          fw.close();    
         }catch(Exception e){System.out.println(e);}  
        try {
		      fw.close();;
				}
		    catch (IOException e) {
				
				e.printStackTrace();
			}
         System.out.println("Success...");    
}
}