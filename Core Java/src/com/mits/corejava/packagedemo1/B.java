package com.mits.corejava.packagedemo1;

import com.mits.corejava.packagedemo.C;//import package.classname

//import com.mits.corejava.packagedemo.*;  //use package.* use access all class 

class B{  
  public static void main(String args[]){  
  /* A obj = new A();  
   obj.msg();
   obj.call();
  
 /*  com.mits.corejava.packagedemo.C obj1 = new com.mits.corejava.packagedemo.C();  //fully qualified name
   obj1.msg1();
   obj1.call1();*/
	  C obj1 = new C();  
	   obj1.msg1();
	   obj1.call1();
  
  }  
	

}
