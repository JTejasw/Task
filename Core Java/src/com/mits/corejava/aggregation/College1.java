package com.mits.corejava.aggregation;



public class College1 {

	
	     String collegeName;
	     //Creating HAS-A relationship with Address class
	     Address collegeAddr; 
	     College1(String name, Address addr){
	         this.collegeName = name;
	         this.collegeAddr = addr;
	     }
		@Override
		public String toString() {
			return "College [collegeName=" + collegeName + ", collegeAddr=" + collegeAddr + "]";
		}
		
		
		
		
			public static void main(String[] args) {
				Address objAddr = new Address(12, "hyderabed", "Telengana", "India", 500032);
				College objclg = new College ("Gates", objAddr);
				System.out.println(objclg.toString());
			}
		 
		 }
		

