package com.mits.corejava.networking;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author mitsind759
 *ServerDemo
 */
public class ServerDemo {// open class

	public static void main(String[] args) {// open
		try { // using try catch
			ServerSocket ss = new ServerSocket(6333);
			Socket s = ss.accept();// establishes connection
			DataInputStream dis = new DataInputStream(s.getInputStream()); // using
																			// datastream
			String str = (String) dis.readUTF(); // using readmethod
			System.out.println("message= " + str);// print message
			ss.close(); // closing socket
		} catch (Exception e) {
			System.out.println(e);
		}
	} // ending main
} // ending class
