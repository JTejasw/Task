package com.mits.corejava.interfacedemo;
interface Bank {
public double getInterestRate();
	}
class SbiImpl implements Bank{
		  
		   public double getInterestRate(){
			  return 9.145;
		  }
	  }
class HdfcImpl implements Bank{
		  public double getInterestRate(){
			  return 8.987 ;
		  }
	  }
class IcicImpl implements Bank{
	  public double getInterestRate(){
		  return 8.987 ;
	  }
}
class InterfaceDemo {

	public static void main(String[] args) {
		SbiImpl objSbi =new SbiImpl();
		System.out.println("Sbi:"+objSbi.getInterestRate());
		Bank objSbi1 =new SbiImpl();
		System.out.println("Sbi:"+objSbi1.getInterestRate());
		Bank objSbi2=new HdfcImpl();
		System.out.println("Hdfc:"+objSbi2.getInterestRate());
	}

}
