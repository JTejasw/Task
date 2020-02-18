package com.mits.corejava.iostreams;

import java.io.*;

public class FileStreamCopyDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		/*
		 * String filePath="C:\\Users\\mitsind759\\Desktop\\File\\text.txt";
		 * String appendText="mitsind759";
		 */
		try {

			fis = new FileInputStream("C:\\Users\\mitsind759\\Desktop\\File\\text.txt");

			fos = new FileOutputStream("C:\\Users\\mitsind759\\Desktop\\File\\text1.txt",true);

			// fos = new
			// FileOutputStream("C:\\Users\\mitsind759\\Desktop\\File\\text1.txt");

			int ch = 0;
			while ((ch = fis.read()) != -1) {

				fos.write((char) ch);

			}

		} catch (FileNotFoundException foe) {

			foe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {

			try {
				fis.close();
			} catch (IOException ioe) {

				ioe.printStackTrace();

			}

			try {
				fos.close();
			} catch (IOException ioe) {

				ioe.printStackTrace();

			}

		}

		System.out.println("file program executed");

	}

}
