package com.mits.corejava.array;


import java.util.Scanner;

public class ArrayFromuser {

	public static void main(String[] args) {
		int  sum = 0;
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int  n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
           
            sum = sum + a[i];
        }
      
       System.out.println("Sum:"+sum);
    }
    }


