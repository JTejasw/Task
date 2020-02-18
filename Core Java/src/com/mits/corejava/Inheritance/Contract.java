package com.mits.corejava.Inheritance;
 class Employees{
@SuppressWarnings("unused")
private int id;

Employees(int id){
	 this.id=id;
	 System.out.println(id);
	
 }
	
	
}

public class Contract extends Employees {

	Contract(int empid){
		super(empid);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Contract a= new Contract(745);
		
		

	}

}
