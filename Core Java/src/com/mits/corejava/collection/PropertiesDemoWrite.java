package com.mits.corejava.collection;


import java.io.*;
import java.util.*;

public class PropertiesDemoWrite {

	public static void main(String[] args) throws IOException {
		
		Properties p=new Properties();
		p.setProperty("user", "JTejaswini");
		p.setProperty("password", "Teja@123");
		p.store(new FileWriter("D:\\tejaswini.txt"),"writing into the file");
		

	}

}
