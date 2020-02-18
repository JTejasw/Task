package com.mits.corejava.iostreams;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Write {
	public static void main(String args[]){ 
		FileOutputStream f=null;
		 Scanner sc=new Scanner(System.in);
		 
        try{  
        	System.out.println("enter:");
   	     String name=sc.nextLine();
          f=new FileOutputStream("D:\\teju.txt");    
          f.write(name.getBytes());
          }catch(Exception e){System.out.println(e);}  
	
      try {
		      f.close();;
				}
		    catch (IOException e) {
				
				e.printStackTrace();
			}
         System.out.println("Success...");    
}
}