package com.mits.corejava.Inheritance;

class SuperClass  {
	 String name="Tejaswini";
	 public static String superClassMethod()
	 {
		 return "super class method ";
	 }
}
 class OverridingSuperClass extends SuperClass {
	
	static String name="vamsi";
    
	public  static String superClassMethod()
		 {
			 return "sub class method";
		 }
		
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
			 
		  	/* System.out.println(obja.name);
			 System.out.println(obja.superClassMethod());
			 System.out.println(objb.name);
			 System.out.println(objb.superClassMethod());*/
			 SuperClass objb1=new OverridingSuperClass();
			 System.out.println(objb1.name);
			System.out.println(objb1.superClassMethod());
			 
				
			}
	 }

