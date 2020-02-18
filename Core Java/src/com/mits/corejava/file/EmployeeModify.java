package com.mits.corejava.file;

import java.io.*;
import java.util.Scanner;

public class EmployeeModify {
	static PrintWriter pr;
	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter how many details you want to add:");
		int n = s.nextInt();
		Employee e = new Employee();
		
		
		try {
			pr=new PrintWriter(new FileWriter("D:\\Employee.txt",true));
			
			String str;
			String s11 = null;
			do {

				Employee a[] = new Employee[n];
				for (int i = 0; i < a.length; i++) {
					System.out.println("enter your id:");
					int employeeId = s.nextInt();
					System.out.println("enter your name:");
					String employeeName = s.next();
					System.out.println("enter your age:");
					int employeeage = s.nextInt();
					System.out.println("enter your salary:");
					double employeeSalary = s.nextDouble();
					a[i] = new Employee();
					a[i].setEmployeedetails(employeeId, employeeName, employeeage, employeeSalary);
					s11 = a[i].getemp();
					System.out.println(s11);
				         pr.println(s11);
				}
				System.out.print("do you want enter details again press yes:");
				str = s.next();
				if (str.equalsIgnoreCase("y")) {
					System.out.print("Enter no. of employee details  you want in add again :");
					n = s.nextInt();
				}

			} while (str.equalsIgnoreCase("y"));
		} catch (FileNotFoundException foe) {
			foe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {

			pr.close();

			

		}

		System.out.println("file program executed");

	}

}
