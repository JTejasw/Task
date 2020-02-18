package com.mits.corejava.Exception;

import java.io.IOException;



public class ThrowsIfExceptionOccurs {

	void method() throws IOException {
		throw new IOException("device error");
	}
}

class Testthrows4 {
	public static void main(String args[]) throws IOException {// declare
																// exception
		ThrowsIfExceptionOccurs m = new ThrowsIfExceptionOccurs ();
		m.method();

		System.out.println("normal flow...");
	}
}
