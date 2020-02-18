package com.mits.corejava.file;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.mits.corejava.Exception.InvalidName;

public class FetchRecord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter which recode u want to fetch");
		String id = sc.nextLine();
		File f = new File("D:\\Employee.txt");
		FileReader fr = null;
		BufferedReader bf = null;
		String id1=null;
		try {

			fr = new FileReader(f);
			bf = new BufferedReader(fr);

			String a;
			
				String[] arr = null;
				// a = bf.readLine();

				while ((a = bf.readLine()) != null) {

					arr = a.split(",");
					id1= arr[0];

					if (id1.equals(id)) {
						System.out.print(a);
						 break;
						
					}
			
					
					
					}
					
			
				if( !id1.equals(id))   throw new NoSuchRecordFoundException ("NoSuchRecordFoundException");
				

			
			} 
	    catch (NoSuchRecordFoundException e) {
		e.printStackTrace();
	} catch (FileNotFoundException foe) {
		System.out.println(foe);
	}
			catch (IOException e) {

				e.printStackTrace();
			}

		

	}
}