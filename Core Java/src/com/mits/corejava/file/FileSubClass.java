package com.mits.corejava.file;

import java.io.File;

public class FileSubClass {

	public String method1(String dir) {
		File file = new File(dir);
		String[] arr = file.list();
		
		if (file.isFile()){
			System.out.println("file is:" + file.getName());}
		else if (file.isDirectory()) {
			System.out.println("floder is:" + file.getName());
		}
		try {
			for (int i = 0; i < arr.length; i++) {
				method1(dir + arr[i] + "\\");
			}
		} catch (Exception e) {
			System.out.println("going next directory");
		}
		return "completed";

	}

	public static void main(String[] args) {
		FileSubClass fs = new FileSubClass();
	System.out.println(	fs.method1("C:\\Tejaswini\\"));
	}
}