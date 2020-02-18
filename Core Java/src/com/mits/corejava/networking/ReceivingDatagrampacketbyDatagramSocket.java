package com.mits.corejava.networking;

import java.io.IOException;
import java.net.*;

public class ReceivingDatagrampacketbyDatagramSocket {

	public static void main(String[] args) throws IOException {
		   DatagramSocket ds = new DatagramSocket(3000);  //using datagram socket
		    byte[] buf = new byte[1024];  
		    DatagramPacket dp = new DatagramPacket(buf, 1024);  //using datagrampacket
		    ds.receive(dp);  
		    String str = new String(dp.getData(), 0, dp.getLength());  
		    System.out.println(str);  
		    ds.close();  
	}

}
