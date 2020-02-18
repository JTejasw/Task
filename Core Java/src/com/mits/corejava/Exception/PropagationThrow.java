package com.mits.corejava.Exception;

public class PropagationThrow {
	/*void p() {
		throw new ArithmeticException("not valid");
	}

	void m() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}

	}

	void n() {
		p();
	}

	public static void main(String args[]) {
		PropagationThrow obj = new PropagationThrow();
		obj.m();

		System.out.println("rest of the code...");
	}
}*/
void m(){  
    int data=50/0;  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
	  PropagationThrow obj=new PropagationThrow();  
   obj.p();  
   System.out.println("normal flow...");  
  }  }

