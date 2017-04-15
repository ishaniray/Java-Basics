import java.util.Scanner;

public class SparseMatrixRepresentation 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 	/* creation of Scanner-class object */
		
		System.out.println("How many rows and columns does your sparse matrix have?");
		int row = scanner.nextInt(); 	/* number of rows */
		int col = scanner.nextInt(); 	/* number of columns */
		
		int[][] mat = new int[row][col]; 	/* creation of a 'row'x'column' matrix */
		
		System.out.println("\nEnter values into the matrix (row-wise):");
		for(int i = 0; i < row; ++i)
			for(int j = 0; j < col; ++j)
				mat[i][j] = scanner.nextInt(); 	/* scanning in values */
		
		System.out.println("\nThe matrix you entered is:");
		displayMat(mat, row, col);
		
		int[][] sparse = sparseRep(mat, row, col);		/* creating space to hold sparse representation of mat[][] */
		
		System.out.println("\nIts sparse representation is:");
		displayMat(sparse, sparse[0][2] + 1, 3);	/* number of rows in sparse[][] = number of non-zero elements in mat[][] + 1 = sparse[0][2] + 1 */
		
		int[][] transpSparse = transposeSparseRep(sparse, sparse[0][2] + 1); 	/* creating space to hold sparse representation of transpose of mat[][] */
		
		System.out.println("\nThe sparse representation of its transpose is:");
		displayMat(transpSparse, transpSparse[0][2] + 1, 3); 	/* number of rows in transpSparse[][] = number of non-zero elements in mat[][] + 1 = transpSparse[0][2] + 1 */
		
		scanner.close(); 	/* closing Scanner-class object */
	}
	
	/* Method to display a matrix */
	public static void displayMat(int[][] mat, int row, int col)
	{
		for(int i = 0; i < row; ++i)
		{
			for(int j = 0; j < col; ++j)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}
	
	/* Method to find and return the number of non-zero elements in an M x N matrix */
	public static int countNonZero(int[][] mat, int row, int col)
	{
		int i, j, count = 0; 	/* 'i', 'j': index variables; 'count' stores the number of non-zero elements in mat[][] */
	    	for(i = 0; i < row; ++i) 	/* traversing the matrix */
	    	{
	    		for(j = 0; j < col; ++j)
	        	{
	    			if(mat[i][j] != 0) 	/* if a non-zero element is found */
	    				count++; 	/* increment 'count' */
	        	}
	    	}
	    	return count;
	}
	
	/* Method to find and return the sparse representation of an M x N matrix */
	public static int[][] sparseRep(int[][] mat, int row, int col)
	{
		int sparseRows = countNonZero(mat, row, col) + 1; 	/* computing the number of rows required for the sparse representation of mat[][] */
		int[][] sparse = new int[sparseRows][3]; 		/* creation of matrix which will hold the sparse representation of mat[][], with 'sparseRows' number of rows and 3 columns */
		
		int i, j, k = 1; 	/* index variables */
		
		/* Populating the first row of sparse[][] */
	    	sparse[0][0] = row;		/* contains the number of rows in the base matrix */
	    	sparse[0][1] = col; 		/* contains the number of columns in the base matrix */
	    	sparse[0][2] = sparseRows - 1; 	/* contains the number of non-zero elements in the base matrix */
	    
	    	/* Populating remaining rows of sparse[][] */
	    	for(i = 0; i < row; ++i)	/* traversing base matrix */
	    	{								   
	    		for(j = 0; j < col; ++j)	  
	        	{
	    			if(mat[i][j] != 0) 		/* if a non-zero element is encountered */
	            		{
	    				sparse[k][0] = i; 		/* contains row index of current non-zero element */
	                		sparse[k][1] = j; 		/* contains row index of current non-zero element */
	                		sparse[k][2] = mat[i][j]; 	/* contains the current non-zero element */
	                		++k; 				/* moving on to next row of sparse[][] */
	            		}
	        	}
	    	}
	   
	    	return sparse; 
	}
	
	/* Method to transpose the sparse representation of a matrix and return the result */
	public static int[][] transposeSparseRep(int[][] sparse, int row)
	{
		int[][] transpSparse = new int[row][3]; 	/* creation of matrix to hold transpose of sparse[][] */
		
		/* Populating the first row of transpSparse[][] */
	    	transpSparse[0][0] = sparse[0][1]; 	/* number of rows in transposed matrix = number of columns in original matrix */
	    	transpSparse[0][1] = sparse[0][0];	/* number of columns in transposed matrix = number of rows in original matrix */
	    	transpSparse[0][2] = sparse[0][2];	/* indicates the number of non-zero elements in the base matrix */
	    
	    	int colCount = 0;
	    	int i, k = 1;		/* index variables */
	    
	    	/* Populating remaining rows of transpSparse[][] */
	    	while(colCount <= sparse[0][1] - 1) 	/* searching for 0th, 1st, ... , (sparse[0][1] - 1t)th column entries */
	    	{
	    		for(i = 1; i < row; ++i)	/* traversing down sparse[][] */
	        	{
	    			if(sparse[i][1] == colCount)	/* a (colCount)th column entry is found */
	            		{
	    				transpSparse[k][0] = sparse[i][1];	/* assigning sparse's column index to transpSparse's row index */
	    				transpSparse[k][1] = sparse[i][0];	/* assigning sparse's row index to transpSparse's column index */
	    				transpSparse[k][2] = sparse[i][2];	/* copying value from sparse to transpSparse */
	                		++k;					/* moving on to next row of transpSparse[][] */
	            		}
	        	}
	        	++colCount; 	/* moving on to next value of colCount */        
	    	}
	    
	    	return transpSparse;
	}
}
