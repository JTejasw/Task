package com.mits.corejava.array;

public class DisplayValues {

	public static void main(String[] args) {
	int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	System.out.println("Display the vlaue:");
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+",");
	}
	System.out.print("\nDisplay the vlaue using for each loop:"+"\n");
	for(int i1:arr){
		System.out.print(i1+",");
	}

	}

}
