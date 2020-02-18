package com.mits.corejava.aggregation;

public class Address {
int streeNum;
String city;
String state;
String country;
int pincode;
public Address(int streeNum, String city, String state, String country, int pincode) {
    this.streeNum = streeNum;
	this.city = city;
	this.state = state;
	this.country = country;
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [streeNum=" + streeNum + ", city=" + city + ", state=" + state + ", country=" + country
			+ ", pincode=" + pincode + "]";
}


}
