package com.mits.corejava.collection;

import java.util.*;

public class Employees {

private List employeeList = new ArrayList();
	//private HashSet employeeList = new HashSet();
	//private TreeSet employeeList = new TreeSet();
	int total=0;
	EmployeeData emp = null;
	// Add Employee method
	public void addEmployee(EmployeeData emp) {
		
		employeeList.add(emp);
	
	}
    //getEmployeeById method
	public EmployeeData getEmployeeById(String tmpId) {
		Iterator i = employeeList.iterator();
		while (i.hasNext()) {
			emp = (EmployeeData) i.next();
			if (emp.getId().equals(tmpId)) {
				return emp;
			}
		}
		return null;
	}
  //getAllEmployees method
	public List getAllEmployees() {
		Collections.sort(employeeList);
		return employeeList;

	}
	/*public HashSet getAllEmployees() {
		return employeeList;

	}*/
	/*public TreeSet getAllEmployees() {
		return employeeList;

	}
*/
	 //deleteEmployee method
	public void deleteEmployee(String tmpId) {
		Iterator i = employeeList.iterator();
		while (i.hasNext()) {
			EmployeeData emp = (EmployeeData) i.next();
			if (emp.getId().equalsIgnoreCase(tmpId)) {
		    employeeList.remove(emp);
		   break;
		    
		}

	}
	}
	//updateEmployeeAddress method
	public boolean updateEmployeeAddress(String tmpId, String address) {
		Iterator i = employeeList.iterator();
		while (i.hasNext()) {
			EmployeeData emp = (EmployeeData) i.next();
			if (emp.getId().equalsIgnoreCase(tmpId)) {
			emp.setAddress(address);
				return true;
			}
		}

		return false;

	}
 //getNoOfEmployees
	public int getNoOfEmployees() {
		return employeeList.size();
	}
   //isEmployeeExists
	public boolean isEmployeeExists(String tmpId) {
		Iterator i = employeeList.iterator();
		while (i.hasNext()) {
			emp = (EmployeeData) i.next();
			if (emp.getId().equals(tmpId)) {
				return true;
			}
		}
		return false;
	}
	public int getTotalSalary(){
		Iterator i = employeeList.iterator();
		while (i.hasNext()) {
			emp = (EmployeeData) i.next();
			total=(int) (total+emp.getsalary());
	}

	return total;
	}
	
}