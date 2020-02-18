package com.mits.corejava.Exception;

/**
 * @author mitsind759
 * TryMultipleCatch block
 */
public class TryMultipleCatch {// class declaration

	public static void main(String[] args) {// main declaration
		int a[] = new int[5];
		String s = null;
		try { // TryMultipleCatch block
			a[10] = 30 / 0;
			System.out.println(a[10]);

			System.out.println(s.length());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		} 
		System.out.println("rest of the code");

	}// closing main
}// closing class
