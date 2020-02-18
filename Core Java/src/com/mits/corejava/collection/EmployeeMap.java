package com.mits.corejava.collection;

public class EmployeeMap implements Comparable<EmployeeMap>{
	private Integer key =null;
	private String name = null;
	private int age = 0;
	private double salary;
	private String address = null;
	public EmployeeMap()
	{	
	}
	public EmployeeMap(Integer key ,  String name, int age, double salary, String address) {
	
		this.key=key;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	public void setKey(Integer key) {
		this.key = key;
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

	public Integer getKey() {
		return key;
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
		return "Employee [Key=" + key + ", name=" + name + ", age=" + age + "salary=" + salary + ", address=" + address
				+ "]";
	}
	
	public int compareTo(EmployeeMap e) {
		return key-e.key;
	}

	
}
