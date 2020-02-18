package com.mits.corejava.collection;

import java.util.*;
import java.util.Map.Entry;

public class EmployeesMethods {
	double salary =0;
	private Map employeemap = new HashMap();

	EmployeeMap emp = null;

	// Add Employee method
	@SuppressWarnings("unchecked")
	public void putEmployee(Integer key, EmployeeMap emp) {
		
		employeemap.put(key, emp);
	}

	public EmployeeMap getEmployeeById(Integer key) {
		emp = (EmployeeMap) employeemap.get( key);
			return emp;
}

	public void deleteEmployee(Integer key) {

		emp = (EmployeeMap) employeemap.get(key);
			employeemap.remove(emp);
		

	}

	public boolean updateEmployeeAddress(Integer key, String address) {

		emp = (EmployeeMap) employeemap.get(key);
		emp.setAddress(address);
		return true;

	}

	public Map getAllEmployees() {
		
	Set	set=employeemap.entrySet();
//	Map.Entry entry=(Entry) Map.entrySet();
	//Map.Entry<String, Integer> en : hm1.entrySet()
	//Collections.sort( employeemap,entry);
		return employeemap;
	}

	public boolean isEmployeeExists(Integer key) {

		emp = (EmployeeMap) employeemap.get(key);
			return true;
		

		
	}

	public int getNoOfEmployees() {
		int i = employeemap.size();
		return i;
	}

	
	public double getTotalSalary() {
	
	Set keys = employeemap.keySet();
	Iterator i =   keys .iterator();
	while (i.hasNext()) {
		Integer key=(Integer)i.next();
       emp=(EmployeeMap)employeemap.get(key);
	   salary += emp.getsalary();
	}
	return salary;
	}
	
	  
	 
	       
	
	
	
}
