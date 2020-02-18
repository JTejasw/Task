package com.mits.corejava.file;
import java.io.BufferedWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ByteStreamsToCharStreams {

	public static void main(String[] args) {
		FileOutputStream fo=null;
		BufferedWriter bf=null;
		OutputStreamWriter or=null;
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter:");
	     String name=sc.nextLine();
		
			try {
				bf=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\teju.txt",true)));
		
		
				try {
				bf.write(name);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}  
			
				try {
					bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			

	}

}
