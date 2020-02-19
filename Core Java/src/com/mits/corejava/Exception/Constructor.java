package com.mits.corejava.Exception;

import java.util.Scanner;
import java.util.regex.Pattern;



public class Constructor {

	private static String name;
	private static int age;

	Constructor(String name, int age) throws InVaildAge ,InvalidName{
		this.name = name;
		this.age = age;
		if (this.age < 18) {
			throw new InVaildAge("age out of range: " + this.age + "  not eligable to vote ");
		}
		
		if (!(Pattern.matches("[a-zA-Z]", this.name))) {
			throw new InvalidName("Invaild name due to you enter other then alphabits  \t");
	}
	}
	@Override
	public String toString() {
		return "Name is " + name + " your Age is:" + age;
	}

	public static void main(String args[]) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		name = sc.next();
		System.out.println("enter your age:");
		age = sc.nextInt();

		try {
			Constructor	emp = new Constructor(name, age);
			System.out.println(emp.toString());
		} catch (InVaildAge e) {

			System.out.println(e);
		} catch (InvalidName e) {
			
			System.out.println(e);
		}
//https://github.com/JTejasw/GitHubDemo.git
		
	}
}
