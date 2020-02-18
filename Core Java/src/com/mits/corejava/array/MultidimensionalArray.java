package com.mits.corejava.array;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int numbers[][] = new int[4][2]; // 3 rows 2 cols
		numbers[0][0] = 1;
		numbers[0][1] = 2;
		
		numbers[1][0] = 3;
		numbers[1][1] = 4;
		
		numbers[2][0] = 5;
		numbers[2][1] = 6;
		
		numbers[3][0] = 7;
		numbers[3][1] = 8;

		/*
		 3 rows 2 cols
		 1 2
		 3 4
		 5 6
		  
		 */

		System.out.println(numbers[0][0]+"\t"+numbers[0][1]);
		System.out.println(numbers[1][0]+"\t"+numbers[1][1]);
		System.out.println(numbers[2][0]+"\t"+numbers[2][1]);
		System.out.println(numbers[3][0]+"\t"+numbers[3][1]);
	
		System.out.println("************************************");
		
		int numbers1[][] = {{7,8},{9,10},{11,12},{13,14}};
		System.out.println(numbers1[0][0]+"\t"+numbers1[0][1]);
		System.out.println(numbers1[1][0]+"\t"+numbers1[1][1]);
		System.out.println(numbers1[2][0]+"\t"+numbers1[2][1]);		
		System.out.println(numbers[3][0]+"\t"+numbers[3][1]);
		System.out.println("************************************");
		
		for(int i=0; i<4; i++){
		 for(int j = 0; j<2; j++) {
			 
			 System.out.print(numbers[i][j]+" ");
		 }	
		System.out.println();
	}
	}
}
