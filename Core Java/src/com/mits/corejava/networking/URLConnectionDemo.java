package com.mits.corejava.networking;

import java.io.*;
import java.io.*;
import java.net.*;

public class URLConnectionDemo {

	public static void main(String[] args) throws IOException {
		URL url=new URL("https://dzone.com/articles/java-nio-vs-io");
		URLConnection urc =url.openConnection();
		//InputStream stream=urc.getInputStream();
		/*int i;
		while((i=stream.read())!=-1){
			System.out.print((char)i);
			
		}
		*/
		for(int i=0;i<=8;i++){
			System.out.println(urc.getHeaderFieldKey(i)+"=="+urc.getHeaderField(i));
			}
		//stream.close();
	}

}
