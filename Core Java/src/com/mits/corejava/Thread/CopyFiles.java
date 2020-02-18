package com.mits.corejava.Thread;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class CopyFiles {//opening class
	

	public static void main(String[] arg) throws FileNotFoundException {//opening main
        String sourse="C:\\Users\\mitsind759\\Desktop\\pics";
        String destination="C:\\Users\\mitsind759\\Desktop\\newpics";
       
        File source1 = new File(sourse);//using file object for source
        String args[]= source1.list();//using list 
		File dest = new File(destination);//using file object for destinationl
		CopyThread1 ct1=new CopyThread1(sourse, destination, args);//creating thread1 object
		CopyThread2 ct2=new CopyThread2(sourse, destination, args);//creating thread2 object
		ct1.start();//calling thread1
		ct2.start();//calling thread2
    	
    	
    	
    	
    
		
		
	}//end main
	

}//end class
