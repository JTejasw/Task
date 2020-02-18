package com.mits.corejava.file;

import java.io.*;

public class FileStreamCopyDemo {

	
	public static void main(String[] args) {

		File fis = new File("C:\\Users\\mitsind759\\Desktop\\File\\text.txt");
		File fos = new File("C:\\Users\\mitsind759\\Desktop\\File\\text1.txt");
		
       FileReader fr=null;
       FileWriter fw=null;

		try {
			fr=new FileReader(fis);
			fw=new FileWriter(fos);
        
         int i=0;
			while((i=fr.read())!= -1) {
				fw.write(i);;
			}
		} catch (FileNotFoundException foe) {

			foe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {

			try {
				 fr.close();
			} catch (IOException ioe) {

				ioe.printStackTrace();

			}

			try {
				fw.close();
			} catch (IOException ioe) {

				ioe.printStackTrace();

			}

		}

		System.out.println("file program executed");

	}

	

}
