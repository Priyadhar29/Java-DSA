package Project;
public class hollspi {
	    public static void main(String[] args) {
	        int n = 5; // You can change this value to create a different size matrix
	        int[][] hollowSpiralMatrix = generateHollowSpiralMatrix(n);
	        printMatrix(hollowSpiralMatrix);
	    }
	    public static int[][] generateHollowSpiralMatrix(int n) {
	        int[][] matrix = new int[n][n];
	        int left = 0, right = n - 1, top = 0, bottom = n - 1;
	        int num = 1;
	        while (left <= right && top <= bottom) {
	            // Fill the top row
	            for (int i = left; i <= right; i++) {
	                if (top == 0) {
	                    matrix[top][i] = num++;
	                }
	            }
	            top++;
	            // Fill the right column
	            for (int i = top; i <= bottom; i++) {
	                if (right == n - 1) {
	                    matrix[i][right] = num++;
	                }
	            }
	            right--;
	            // Fill the bottom row
	            if (top <= bottom) {
	                for (int i = right; i >= left; i--) {
	                    if (bottom == n - 1) {
	                        matrix[bottom][i] = num++;
	                    }
	                }
	                bottom--;
	            }
	            // Fill the left column
	            if (left <= right) {
	                for (int i = bottom; i >= top; i--) {
	                    if (left == 0) {
	                        matrix[i][left] = num++;
	                    }
	                }
	                left++;
	            }
	        }
	        return matrix;
	    }
	    public static void printMatrix(int[][] matrix) {
	    	    for (int i = 0; i < matrix.length; i++) { // Loop through each row
	    	        for (int j = 0; j < matrix[i].length; j++) { // Loop through each column in the row
	    	            if (matrix[i][j] == 0) {
	    	                System.out.print(" " + "\t"); // Print space for zero values
	    	            } else {
	    	                System.out.print(matrix[i][j] + "\t"); // Print the actual value
	    	            }
	    	        }
	    	        System.out.println(); // Move to the next line after each row
	    	    }
	    	}
	}


