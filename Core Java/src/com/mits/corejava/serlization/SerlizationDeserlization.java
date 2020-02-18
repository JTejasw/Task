package com.mits.corejava.serlization;
import java.io.*;
class Student implements Serializable{  
	 transient int id;  
	  String name; 
	  String address;
	  public Student(int id, String name,String address ) {  
	  this.id = id;  
	  this.name = name;  
	  this.address=address;
	 }  
	}  
	public class SerlizationDeserlization {
		
	public static void main(String[] args) {
		
		try{  
			  //Creating the object  
			  Student sent =new Student(211,"ravi","hyd");  
			  
			  //Creating stream and writing the object  
			  FileOutputStream fout=new FileOutputStream("D:\\Employee.txt");  
			  ObjectOutputStream out=new ObjectOutputStream(fout);  
			  out.writeObject(sent);
			    sent.name="teja";
			
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\Employee.txt"));  
			  Student recevier=(Student)in.readObject();  
			  System.out.println("receiver "+recevier.id+" "+recevier.name+" "+recevier.address);  
			  //closing the stream  
			  in.close();  
			  out.flush();  
			  //closing the stream  
			  out.close();  
			  System.out.println("success");  
			  }catch(Exception e){System.out.println(e);}  
			 }  
	}


