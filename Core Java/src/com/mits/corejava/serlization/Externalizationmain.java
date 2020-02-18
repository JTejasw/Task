package com.mits.corejava.serlization;

import java.io.*;

public class Externalizationmain {

	public static void main(String[] args) {
		Employee s = null;
		try {
			// Creating the object
			s = new Employee(121, "ravi");
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("D:\\Employee.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
		    objout.writeObject(s);
			//s.writeExternal(objout);
           
               // Creating stream and reading the object
         			FileInputStream fin = new FileInputStream("D:\\Employee.txt");
         			ObjectInputStream objin = new ObjectInputStream(fin);
         		     Employee e=(Employee)objin.readObject();
         			//s.readExternal(objin);
         			
         		    System.out.println(e.toString());  
         		    fout.close();
         			fin.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		  
	}
}
