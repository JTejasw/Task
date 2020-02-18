package com.mits.corejava.array;

public class Maximum2d {
	
	public static int max(int[][] a){  
		int max=a[0][0];
		
		for(int i=0; i<a.length; i++){
			 for(int j = 0; j<a[i].length; j++) {
				 
		 if(max<a[i][j])  {
		 max=a[i][j];  
		 }
			 }}
		return max; 
		
	}
		public static void main(String args[]){  
		int a[][]={{3,33,4,5},{7,8,9,10},{45,6,97,89}};//declaring and initializing an array  
	
		System.out.println(max(a));
	}
		
}
