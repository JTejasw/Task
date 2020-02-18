package com.mits.corejava.Thread;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Transfer{//creating transfer class
	public void transfer(String source,String destination){//creating transfer method
		try {//using try,catch block
			Path temp=Files.copy(Paths.get(source), Paths.get(destination));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end method
}//end class
public class CopyThread1 extends Thread{//creating thread1 class
      String source;
	  String Destination;
	  String  file[];
	public CopyThread1(String source, String destination, String file[]) {//creating constructor
		this.source = source;
		Destination = destination;
		this.file = file;
	}
	public void run(){//creating run method
	
	Transfer tra =new Transfer();//creating transfer object
	for(int i=0;i<file.length/2;i++){//using for loop
		tra.transfer(this.source+File.separator+this.file[i],this.Destination+File.separator+this.file[i]);
	}
	}//end run method
	
	
}//end class

 class CopyThread2 extends Thread {//creating thread2 class
	  String source;
	  String Destination;
	  String  file[];
	public CopyThread2(String source, String destination, String[] file) {//creating constructor
		
		this.source = source;
		Destination = destination;
		this.file = file;
	}
	public void run(){//creating run method
		Transfer tra =new Transfer();//creating transfer object
		
	for(int i=file.length/2;i<file.length;i++){//using for loop
		tra.transfer(this.source+File.separator+this.file[i],this.Destination+File.separator+this.file[i]);
	}
	}//end run method
		
	}//end class





















