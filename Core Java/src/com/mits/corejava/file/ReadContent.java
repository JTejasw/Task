package com.mits.corejava.file;
import java.io.*;
public class ReadContent {

	public static void main(String[] args) {
		FileReader fr =  null;
		try {
				
			String fileName = "C:\\Users\\mitsind759\\Desktop\\input.txt";
			fr = new FileReader(fileName);
			
			int i=0;
			while((i=fr.read())!= -1) {
				System.out.print(((char)i));
			}
			
		
		}catch(FileNotFoundException fe) {
			System.out.println(fe.getMessage());
			fe.printStackTrace();
			
		} catch(IOException ioe) {
			
			ioe.printStackTrace();
		} finally {
			try {
				if(fr != null)
					fr.close();
			}catch(IOException ioe) {
				
				ioe.printStackTrace();
			}
		}
		System.out.println("rest of code executed");
	}

	}


