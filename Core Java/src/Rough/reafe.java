package Rough;

import java.util.Arrays;

public class reafe {

/*	public static int[] numbers() {
		int[] arr = { 5, 6, 7, 8, 9 }; // initializing array
		return arr;
	}

	public static void main(String args[]) {
		int[] a = numbers(); 
		
		// obtain the array
		for (int b:a) // for loop to print the array
			System.out.print(b);
	}

}*/}
 class ReturnArrayExample3  
{  
public static double[] returnArray( )  
{  
double[] arr = new double [3];    // Creating an array of 3 elements  
arr[0]=6.9;  
arr [1]=2.5;  
arr [2]=11.5; 
double x[]=arr;    
return( x );            // Return the reference of the array  
}  
public static void main(String[] args)  
{  
double[] a;         //variable to store returned array  
a = returnArray();      //called method  
for (int i = 0; i < a.length; i++) //for loop to print the array  
System.out.println( a[i]+ " ");     
}  
}  