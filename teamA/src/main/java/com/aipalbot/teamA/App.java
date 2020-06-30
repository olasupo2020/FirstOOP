package com.aipalbot.teamA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        
        int a= 2;
    	int a1 =2;
    	int b =2;
    	int b1 = 2;
    
    	
    	
    	int[][] matrixA= {{5,8},{7, 2}};
    	int[][]  matrixB ={{3,1},{2,4}};
    	
    	//Multiplying
    	
    	int[][] arr = multiplyMatrix(matrixA, matrixB, a, b, b1);
    		
    	displayArr(arr);
    	
		
		
	}

	public static int [][] multiplyMatrix(int[][] matrixA,int[][] matrixB,int a, int b, int b1 ){
		
		int[][] arr =new int[a][b1];
		for(int i = 0; i< a; i++) {
			for(int j = 0; j < b; j++) {
				for(int k = 0; k < b1; k++) {
					
					arr[i][j] += matrixA[i][k] * matrixB[k][j];
				}
				
			}
		}
		
		return arr;
	}
	
	public static void displayArr(int[][] arr) {
		System.out.println(" The result of Two matric is :-");
		
		
		 for(int[] row : arr) {
			 
			 for(int colum : row) {
			 
			 System.out.print(colum + "    ");
		 }
			 System.out.println();
		
		 }
    }
}
