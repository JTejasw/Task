package com.mits.corejava.polymorphism;
public class Person {
	
	String name;
	String address;
	
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}
	
	
	
}
