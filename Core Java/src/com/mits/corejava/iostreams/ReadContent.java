package com.mits.corejava.iostreams;
import java.io.*;
public class ReadContent {

	public static void main(String[] args) {
		FileInputStream fis =  null;
		try {
				
			String fileName = "C:\\Users\\mitsind759\\Desktop\\input.txt";
			fis = new FileInputStream(fileName);
			
			int i=0;
			while((i=fis.read())!= -1) {
				System.out.print(((char)i));
			}
			
		
		}catch(FileNotFoundException fe) {
			System.out.println(fe.getMessage());
			fe.printStackTrace();
			
		} catch(IOException ioe) {
			
			ioe.printStackTrace();
		} finally {
			try {
				if(fis != null)
					fis.close();
			}catch(IOException ioe) {
				
				ioe.printStackTrace();
			}
		}
		System.out.println("rest of code executed");
	}

	}


