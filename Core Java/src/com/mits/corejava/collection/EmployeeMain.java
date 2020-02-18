package com.mits.corejava.collection;

import java.awt.List;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author mitsind759
 *Write an Employees class  to implement the below functionality
 *private List employeeList = new ArrayList();
 *public void addEmployee(Employee emp)
 *public Employee getEmployeeById(String empId)
 *public List getAllEmployees() 
 *public void deleteEmployee(String empId)
 *public boolean updateEmployeeAddress(String empId, String address)
 *public int getNoOfEmployees()
 *public boolean isEmployeeExists(String empId)
 */
public class EmployeeMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Employees empMethod = new Employees();
		EmployeeData emp = new EmployeeData();

		String tmpId;
		String tmpName;
		int tmpAge;
		double tmpSalary;
		String tmpAddress;
		String str;
		int n;
		System.out.println("enter your id:");
		emp.setId(s.next());
        System.out.println("enter your name:");
		tmpName = s.next();
		emp.setName(tmpName);
		System.out.println("enter your age:");
		tmpAge = s.nextInt();
		emp.setAge(tmpAge);
		System.out.println("enter your salary:");
		tmpSalary = s.nextDouble();
		emp.setSalary(tmpSalary);
		System.out.println("enter your address:");
		tmpAddress = s.next();
		emp.setAddress(tmpAddress);

		empMethod.addEmployee(emp);

		do {
			System.out.println(
					"1.Add Employee,\n2.getEmployeeById,\n3.delete Employee,\n4.update Employee,\n5.Employees List,\n6.Employee Exists\n7.getNoOfEmployees");
			String s1 = s.next();
			switch (s1) {
			// Add Employee
			case "1":
				emp = new EmployeeData();
				System.out.println("enter your id:");
				tmpId = s.next();
				emp.setId(tmpId);
				System.out.println("enter your name:");
				tmpName = s.next();
				emp.setName(tmpName);
				System.out.println("enter your age:");
				tmpAge = s.nextInt();
				emp.setAge(tmpAge);
				System.out.println("enter your salary:");
				tmpSalary = s.nextDouble();
				emp.setSalary(tmpSalary);
				System.out.println("enter your address:");
				tmpAddress = s.next();
				emp.setAddress(tmpAddress);
				empMethod.addEmployee(emp);

				break;
			// getEmployeeById
			case "2":
				emp = new EmployeeData();
				System.out.print("enter your id:");
				tmpId = s.next();
				emp = empMethod.getEmployeeById(tmpId);
				System.out.println("Id match details employee:" + emp.getName() + emp.getAge() + emp.getsalary()
						+ emp.getAddress());
				break;
			// delete Employee
			case "3":
				emp = new EmployeeData();
				System.out.print("enter your id you want to delete:");
				tmpId = s.next();
				empMethod.deleteEmployee(tmpId);
				System.out.println("delete success");
				break;
			// update Employee
			case "4":
				emp = new EmployeeData();
				System.out.print("enter your id you want to update:");
				tmpId = s.next();
				System.out.print("enter your new address:");
				tmpAddress = s.next();
				if (empMethod.updateEmployeeAddress(tmpId, tmpAddress)) {
					System.out.println("update success:");
				}
				break;
			// Employees List
			case "5":
				emp = new EmployeeData();

				java.util.List i1 = empMethod.getAllEmployees();
				// HashSet i1 = empMethod.getAllEmployees();
				// TreeSet i1 = empMethod.getAllEmployees();
				System.out.println("Employees list success" + i1);
				break;
			// Employee Exists
			case "6":
				emp = new EmployeeData();
				System.out.print("enter your id you want to search:");
				tmpId = s.next();
				if (empMethod.isEmployeeExists(tmpId))
					System.out.println("employee exist");
				else
					System.out.println("employee doesn't exist");
				break;
			// getNoOfEmployees
			case "7":
				emp = new EmployeeData();
				System.out.println("NoOfEmployees:" + empMethod.getNoOfEmployees());
				break;
			default:

				System.out.println("doesnot match (you enter wrongly)");

			}
			System.out.print("do you want enter details again press yes:");
			str = s.next();

		} while (str.equalsIgnoreCase("yes"));
	}
}
