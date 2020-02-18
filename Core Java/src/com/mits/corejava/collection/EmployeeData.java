package com.mits.corejava.collection;

import java.util.Iterator;

public class EmployeeData implements Comparable<EmployeeData>{

	private String id =null;
	private String name = null;
	private int age = 0;
	private double salary;
	private String address = null;
	public EmployeeData()
	{	
	}
	public EmployeeData(String id, String name, int age, double salary, String address) {
	
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getsalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "salary=" + salary + ", address=" + address
				+ "]";
	}
	public int compareTo(EmployeeData e) {
		
		return id.compareTo(e.id);
		
	}

	


	
}
