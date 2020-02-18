package com.mits.corejava.array;

import java.util.Scanner;

public class EmployeeDetails {

	private String name;

	private int age;
	private double salary;

	public EmployeeDetails(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String str;
		System.out.println("Enter Employee Deatils:");
		System.out.print("Enter no. of employee details  you want in add :");
		int n = s.nextInt();
		EmployeeDetails temobj = null;
		@SuppressWarnings("unused")
		int tmpId;
		String tmpName;
		int tmpAge;
		do {

			System.out.println(n);
			EmployeeDetails a[] = new EmployeeDetails[n];
			for (int i = 0; i < a.length; i++) {
				System.out.println("enter your name:");
				String temname = s.next();
				System.out.println("enter your age:");
				int temage = s.nextInt();
				System.out.println("enter your designation:");
				String designation = s.nextLine();
				s.nextLine();
				System.out.println("enter your salary:");
				double temSalary = s.nextDouble();
				a[i] = new EmployeeDetails(temname, temage, temSalary);
				

				System.out.println(a[i].toString());

			}

			System.out.print("Enter no. of employee details  you want in add again :");
			n = s.nextInt();
			System.out.print("do you want enter details again press yes:");
			str = s.next();

		} while (str.equalsIgnoreCase("y"));

	}
}
