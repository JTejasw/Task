package com.mits.corejava.array;

public class Update {

	

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		/* for(int i=0;i<a.length;i++){
	  			System.out.println(a[i]);
	  			}*/
		System.out.println("1st  element:"+a[0]);
		System.out.println("5st  element:"+a[4]);
		System.out.println("9st  element:"+a[8]);
     int arr1[]= {a[0],a[1],a[2],a[3],a[4],a[5],a[6],a[7],a[8],a[9],11,12,13,14,15};
        
          for(int j=0;j<arr1.length;j++){
  			System.out.print(arr1[j]);
  		}
          System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
          for(int j=0;j<arr1.length;j++){

      
			if(j==2){			
    	  continue;
			} 
			System.out.print(arr1[j]+" ");
			
    		}
	}
}

