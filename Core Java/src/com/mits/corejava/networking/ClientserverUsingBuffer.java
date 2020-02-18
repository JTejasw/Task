package com.mits.corejava.networking;

import java.io.*;

import java.net.Socket;

/**
 * @author mitsind759
 * Write client server program (Read-Write both side)
 */
public class ClientserverUsingBuffer {//declaring class
	public static void main(String args[]) throws Exception {//declaring main
		Socket s = new Socket("localhost", 9999);//using socket object
		DataInputStream din = new DataInputStream(s.getInputStream());//using DIS object
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());//using DOS object
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//using BufferedReader

		String str = "", str2 = "";//Initialization string
		while (!str.equals("stop")) {//using while loop
			str = br.readLine();//using readmethod
			dout.writeUTF(str);//using writemethod
			dout.flush();//using flush method
			str2 = din.readUTF();//using readmethod
			System.out.println("Server says: " + str2);//print
		}//end loop

		dout.close();//closing DOS
		s.close();//closing Socket
	}//end main
}//end class