package com.mits.corejava.file;

import java.io.File;
import java.io.IOException;

public class DemonstratreMethod {

	public static void main(String[] args) {
		//accept file name or directory name through command line args 
        String fname =args[0]; 
        String fname1="C:\\Users\\mitsind759\\Desktop\\File\\text.txt";
        //pass the filename or directory name to File object 
        File f = new File(fname); 
        File f1 = new File(fname1); 
        //apply File class methods on File object 
        System.out.println("abstract representation can Execute() :"+f. canExecute() ); //1
        System.out.println("Is writeable:"+f.canWrite()); //2
        System.out.println("Is readable:"+f.canRead()); //3
        System.out.println("int compareTo(File pathname):"+f.compareTo(f1)); //4
        
		//System.out.println("boolean createNewFile() :"+f1.createNewFile());//5
	  //  System.out.println("static File createTempFile(String prefix, String suffix) :"+f.createTempFile(fname, fname1)); //2
	    System.out.println("boolean delete():"+f1.delete()); //7
        System.out.println("boolean equals(Object obj):"+f.equals(f1)); //8
        System.out.println("Exists :"+f.exists()); //9
        System.out.println("Absolute path:" +f.getAbsolutePath()); //10
        System.out.println("long getFreeSpace() " +f.getFreeSpace()); //10
        System.out.println("String getName():"+f.getName()); 
        System.out.println("String getParent(): "+f.getParent()); 
        System.out.println("File getParentFile():"+f.getParentFile()); //14
        System.out.println("String getPath() "+f.getPath());//15 
        System.out.println("boolean isDirectory() "+f.isDirectory());//16 
        System.out.println("boolean isFile()  "+f.isFile()); 
        
        System.out.println("boolean isHidden() "+f.isHidden()); 
        
        System.out.println("long length()  "+f.length()); 
        
        System.out.println("String[] list() "+f.list()); 
        
        System.out.println("File[] listFiles() : "+f.listFiles()); 
        
        System.out.println("boolean mkdir() :"+f.mkdir()); 
        System.out.println("boolean renameTo(File dest) :"+f.renameTo(f)); 
       // System.out.println("boolean setExecutable(boolean executable) "+f.setExecutable(executable)); 
	
             System.out.println("boolean setReadable "+f.setReadable(true)); 
        
      //  System.out.println("boolean setReadable(boolean readable, boolean ownerOnly) :  "+f.setReadable(readable, ownerOnly)); 
        
        System.out.println("boolean setReadOnly() "+f.setReadOnly()); 
        
        System.out.println("boolean setWritable(boolean writable) : "+f.setWritable(true)); 
        
        System.out.println("String toString()"+f.toString()); 
        System.out.println("String toString()"+f.toURI()); 
}
}