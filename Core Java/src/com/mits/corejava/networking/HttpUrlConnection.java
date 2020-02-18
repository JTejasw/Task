package com.mits.corejava.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class HttpUrlConnection {

	public static void main(String[] args) throws IOException {
		URL url= new URL("https://www.javatpoint.com/java-http-url-connection");
		
		URLConnection urc =url.openConnection();
		HttpURLConnection huc=(HttpURLConnection) urc;
		//InputStream stream=huc.getInputStream();
		/*int i;
		while((i=stream.read())!=-1){
			System.out.print((char)i);
			
		}*/
		for(int i=0;i<=8;i++){
		System.out.println(huc.getHeaderFieldKey(i)+"=="+huc.getHeaderField(i));
		}

	}

}
/*Date = Wed, 10 Dec 2014 19:31:14 GMT
Set-Cookie = JSESSIONID=D70B87DBB832820CACA5998C90939D48; Path=/
Content-Type = text/html
Cache-Control = max-age=2592000
Expires = Fri, 09 Jan 2015 19:31:14 GMT
Vary = Accept-Encoding,User-Agent
Connection = close
Transfer-Encoding = chunked*/