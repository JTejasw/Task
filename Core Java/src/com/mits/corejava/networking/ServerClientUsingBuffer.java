package com.mits.corejava.networking;

import java.net.*;
import java.io.*;

public class ServerClientUsingBuffer {//class decalration
	public static void main(String args[]) throws Exception {//main declaration
		ServerSocket ss = new ServerSocket(9999);//creating objet serversocket
		Socket s = ss.accept();//creating socket object
		DataInputStream din = new DataInputStream(s.getInputStream());//creating DIS object
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());//creating DOS object
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//using BufferReader object

		String str = "", str2 = "";//variable declaration
		while (!str.equals("stop")) {//w
			str = din.readUTF();
			System.out.println("client says: " + str);
			str2 = br.readLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		din.close();
		s.close();
		ss.close();
	}
}
