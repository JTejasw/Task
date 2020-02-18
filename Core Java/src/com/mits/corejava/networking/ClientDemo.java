package com.mits.corejava.networking;

import java.io.*;
import java.net.Socket;

public class ClientDemo {//open class

	public static void main(String[] args) {//open main
		try{  //using try block
			Socket s=new Socket("172.16.9.153",6858);  //creating socket object
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  //creating DataOutputStream
			
			dout.writeUTF("Teju");  //using writeutf
			dout.flush();  //closing files
			dout.close();  
			s.close();  //closing socket
			}catch(Exception e){System.out.println(e);
			}  
			} //end main 
	}//end class

