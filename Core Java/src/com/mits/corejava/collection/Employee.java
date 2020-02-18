package com.mits.corejava.collection;

public class Employee   {
	
	private String id = ""; 
	private String name = null;
	private int age = 0;
	private String address = null;
	public Employee(String id, String name, int age, String address) {
		
		this.id = id;
		this.name = name;
		this.age = age;
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
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	
	
	

	}

