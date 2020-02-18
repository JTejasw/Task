package com.mits.corejava.collection;

import java.io.*;
import java.util.Properties;

public class PropertiesDemoRead {

	public static void main(String[] args) throws IOException {
		
//		FileReader fr=new FileReader("D:\\tejaswini.txt");
		FileReader fr=new FileReader("D:\\CoreJava\\Task\\Core Java\\src\\Properties");
		Properties p=new Properties();  
	    p.load(fr);  
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  

	}

}
