
public class MatrixMultiplication {
	static int N=4;
	
	//Todo: Each 2D Array can be treated like a matrix.
	//Write a method which takes two matrices as input and returns the result.
	//Write a main-method where you call your created method for matrix multiplication
	//and print the result properly
	
	public static void main (String[] args)  
    { 
        int matrix1[][] = { {9, 8, 7, 6}, 
                         {5, 4, 3, 2}, 
                         {3, 3, 3, 3}, 
                         {4, 4, 4, 4}}; 
  
        int matrix2[][] = { {1, 2, 3, 4}, 
                         {2, 2, 2, 2}, 
                         {5, 6, 7, 8}, 
                         {4, 4, 10, 55}}; 
  
        // To store result 
        int result[][] = new int[N][N] ; 
        int i, j; 
        matrixMulti(matrix1, matrix2, result); 
      
        System.out.println("Result matrix"
                                + " is "); 
        for (i = 0; i < N; i++) 
        { 
            for (j = 0; j < N; j++) 
                System.out.print( result[i][j] 
                                    + " "); 
            System.out.println(); 
        } 
    } 

	        
		      public static void matrixMulti(int[][] matrix1, int[][] matrix2, int[][] result)
		      {
		    	  	      
		      for (int i = 0; i < N; i++) {
		         for (int j = 0; j < N; j++) {
		          result[i][j] = 0;
		            for (int k = 0; k < N; k++) {
		               result[i][j] += matrix1[i][k] * matrix2[k][j];
		            }
		           
		         }
		         
		      }
		   }
 }

