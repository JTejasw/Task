package com.mits.corejava.networking;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class SClient {
	public void load() {
		try{
	Scanner sc=new Scanner(System.in);
	boolean b=false;
	 Socket s=new Socket("172.16.9.143",2001);
	 DataInputStream din =new DataInputStream(s.getInputStream());
	 DataOutputStream dout =new DataOutputStream(s.getOutputStream());
	 System.out.println(din.readUTF());
	 System.out.println("enter");
	dout.writeUTF(sc.nextLine());

	String l="";
	while(!l.equals("exit")){
	while(!b){
		l=din.readUTF();
		b=true;
		}
	System.out.println("server says: "+l);
	while(b){
		
		dout.writeUTF(sc.nextLine());
		b=false;
	}}

	s.close();
	din.close();
	dout.close();
	sc.close();
	}catch(Exception e){
	System.out.println(e);
	e.printStackTrace();}


	}
	public static void main(String args[]) throws Exception {
		SClient cer = new SClient();
		cer.load();
	}
}

