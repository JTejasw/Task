package com.mits.corejava.Exception;

import java.io.IOException;

public class ThrowisfExceptionDoesNotOccur  {

	void method() throws IOException {
		System.out.println("device operation performed");
	}

	public static void main(String args[]) throws IOException {
		ThrowisfExceptionDoesNotOccur m = new ThrowisfExceptionDoesNotOccur();
		m.method();

		System.out.println("normal flow...");
	}
}


