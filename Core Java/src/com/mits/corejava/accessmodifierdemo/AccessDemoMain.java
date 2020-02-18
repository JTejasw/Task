package com.mits.corejava.accessmodifierdemo;

import com.mits.corejava.accessmodifier.AccessDemo;

public class AccessDemoMain extends AccessDemo {

	public static void main(String[] args) {
		AccessDemoMain objaccess =new AccessDemoMain();
    	objaccess.m3();//outside package by subclass only possible
    	objaccess.m4();//public every where
    	
	}

}
