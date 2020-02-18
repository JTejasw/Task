package com.mits.corejava.constructor;

import java.util.Scanner;

public class AccountConstructorsMainUsingSwitch {

	@SuppressWarnings("unused")
	private static Object depositedAmount;

	public static void main(String[] args) {
		AccountConstructorUsingSwitch objAccount = new AccountConstructorUsingSwitch(1234567890, "JTejaswini",1000);
		String a1;
		
		Scanner Scannerobj= new Scanner(System.in);
        System.out.println("wellcome to my bank");
        do{
        System.out.println("select any one option \n Account Details,\n Withdraw,\n deposit,\n balance");
        String enter=Scannerobj.nextLine();
       switch(enter.toLowerCase()){
            case "account details":
             System.out.println(objAccount.getAccountDetails());
            break; 
            case "balance":
            System.out.println(objAccount.getBalance());
            break; 
            case "deposit":
            System.out.println("Enter deposit amount for account1: ");
            @SuppressWarnings("unused")
			double depositAmount = Scannerobj.nextDouble();
            break; 
            
            case "withdraw":
            System.out.println("Enter withdraw Amount  for account1: ");
            double specifiedAmount = Scannerobj.nextDouble();
            double a=objAccount.getBalance();
           double b=objAccount.withdraw(specifiedAmount);
            if(a>specifiedAmount)
            {
            objAccount.withdraw(specifiedAmount);
            }
            else
            System.out.println("you don't have that much amount in account \n please enter suifficent amount");
            break;
            default:
           System.out.println(" it is invaild pls enter correctly");
      }
       
       System.out.println("enter yes for conti");
       a1=Scannerobj.next(); 
       
       }while(a1.equalsIgnoreCase("yes"));
      
        }
        
}





