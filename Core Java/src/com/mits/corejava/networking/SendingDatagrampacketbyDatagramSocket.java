package com.mits.corejava.networking;

import java.io.IOException;//import io package
import java.net.*;//import networking package

public class SendingDatagrampacketbyDatagramSocket {//class declaration
	public static void main(String[] args) throws IOException {//main decleration
		DatagramSocket ds = new DatagramSocket();  //using datagramSocket
	    String str = "Welcome mits";  //declaring variable
	    InetAddress ip = InetAddress.getByName("172.16.9.67");  //using inetaddress object
	     
	    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  //using datagrampacket
	    ds.send(dp);  //sending to datagramSocket
	    ds.close();  //close datagramSocket
}//closing main
}//closing class