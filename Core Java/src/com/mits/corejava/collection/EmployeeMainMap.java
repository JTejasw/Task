package com.mits.corejava.collection;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMainMap {
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 EmployeesMethods empMethod = new EmployeesMethods();
		Integer key ;
		String id;
		String tmpName;
		int tmpAge;
		double tmpSalary;
		String tmpAddress;
		String str;
		int n;
		System.out.println("enter your key value:");
		 key=s.nextInt();
		
		
        System.out.println("enter your name:");
		tmpName = s.next();
		
		System.out.println("enter your age:");
		tmpAge = s.nextInt();
		
		System.out.println("enter your salary:");
		tmpSalary = s.nextDouble();
		
		System.out.println("enter your address:");
		tmpAddress = s.next();
		EmployeeMap emp = new EmployeeMap(key, tmpName, tmpAge, tmpSalary, tmpAddress);

		empMethod.putEmployee(key,emp);
		
 
	    do {
			System.out.println(
					"1.Add Employee,\n2.getEmployeeById,\n3.delete Employee,\n4.update Employee,\n5.Employees List,\n6.Employee Exists\n7.getNoOfEmployees\n8.Total salary");
			String s1 = s.next();
			switch (s1) {
			//Add Employee
			case "1":
				System.out.println("enter your key:");
			 	key= s.nextInt() ;
			    System.out.println("enter your name:");
				tmpName = s.next();
				
				System.out.println("enter your age:");
				tmpAge = s.nextInt();
				
				System.out.println("enter your salary:");
				tmpSalary = s.nextDouble();
				
				System.out.println("enter your address:");
				tmpAddress = s.next();
				
				empMethod.putEmployee(1,emp);
				emp = new EmployeeMap( key,tmpName, tmpAge, tmpSalary, tmpAddress);
				
				empMethod.putEmployee(key,emp);
				//Collections.sort(empMethod);
				break;
			// getEmployeeById
			case "2":
				System.out.println("enter your key value:");
				 key=s.nextInt();
			     emp = empMethod.getEmployeeById(key);
				System.out.println("Key : "+key+"  Value : "+emp.getName());
			    break;
			// delete Employee
			case "3":
				System.out.println("enter your key value:");
				 key=s.nextInt();
				empMethod.deleteEmployee(key);
				System.out.println("delete success");
				break;
			// update Employee
			case "4":
			
				System.out.print("enter your key you want to update:");
				key= s.nextInt() ;
				System.out.print("enter your new address:");
				String Address= s.next();
				if (empMethod.updateEmployeeAddress(key, Address)) {
					System.out.println("update success:");
				}
				break;
			// Employees List
			case "5":
		          Map i1 = empMethod.getAllEmployees();
			      System.out.println("Employees list success" + i1);
				break;
			// Employee Exists
			case "6":
				System.out.print("enter your key you want to search:");
				key= s.nextInt() ;
				if (empMethod.isEmployeeExists( key)){
					System.out.println("employee  is existing");
				}
				else{
					System.out.println("employee doesn't exist");}
				break;
			// getNoOfEmployees
			case "7":
				
				System.out.println("NoOfEmployees:" + empMethod.getNoOfEmployees());
				break;
          	case "8":
				System.out.println("total salary:" + empMethod.getTotalSalary());
				break;
			default:

				System.out.println("doesnot match (you enter wrongly)");

			}
			System.out.print("do you want enter details again press yes:");
			str = s.next();

		} while (str.equalsIgnoreCase("yes"));
	}
}

