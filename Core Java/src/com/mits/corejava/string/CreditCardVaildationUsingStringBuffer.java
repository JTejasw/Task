package com.mits.corejava.string;

import java.util.Scanner;

public class CreditCardVaildationUsingStringBuffer {
	
	public static void main(String[] args) {
			
		
	Scanner s = new Scanner(System.in);
		System.out.print("Enter your frist name:");
		String firstname = s.next();
		System.out.print("Enter your last name:");
		String lastname = s.next();
		System.out.print("Enter your emailL:");
		String email = s.next();
		System.out.print("Enter your date of date of birth:");
		String dob = s.next();
		System.out.print("Enter your gender:");
		String gender = s.next();
		System.out.print("Enter your marital status:");
		String maritalStatus = s.next();
		System.out.print("Enter your phone number:");
		String  phonenumber = s.next();
		System.out.print("Enter your Address:");
		String address = s.next();
		System.out.print("Enter your occupation:");
		String occupation = s.next();
		System.out.print("Enter your Employee:");
		String employee = s.next();
		System.out.print("Enter your city:");
		String city = s.next();
		System.out.print("Enter your pincode:");
		String pincode= s.next();
	
		
		
		
		

		
		StringBuffer sb= new StringBuffer();
		
		
		
		
		
		
		
		
		
		
		if(email.contains("@gmail.com")){
		}else{
			sb.append("Invaild mailid\t");
		    
	        }
		if(dob.length()==10){}
		else{
			sb.append("invaild dod\t");
			
		    }
        if(gender.equalsIgnoreCase("female")||(gender.equalsIgnoreCase("male")))
			{}else{
				sb.append("invaild gender\t");
				
			}
		if(maritalStatus.equalsIgnoreCase("single")||(maritalStatus.equalsIgnoreCase("married")))
		{}else{
			sb.append("invaild marital\t");
			
		}
	    if(phonenumber.length()==10){
			}else
			{
				sb.append("invaild phonenumber\t");
				
			}
       if(pincode.length()==6){
			
		}else{
			sb.append("invaild pincode\t");
			
		}
		if(sb.length()==0){
			System.out.println("accept registration");	
		}
			
		else {
			System.out.println("failed registration");
			System.out.println(sb.toString());
		}
		
}
}