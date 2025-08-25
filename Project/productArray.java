package Project;
import java.util.*;
public class productArray {
	public class ProductArray {

	    // Method to calculate the product array
	    public static int[] printProductArray(int[] arr) {
	        int N = arr.length;
	        int[] res = new int[N]; // Array to store the result
	        
	        for (int i = 0; i < N; i++) {
	            res[i] = 1; // Initialize the result array with 1
	        }

	        // Calculate the product of all elements except the current
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                if (i != j) { // Avoid multiplying the element itself
	                    res[i] *= arr[j];
	                }
	            }
	        }

	        return res; // Return the computed product array
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input number of test cases
	        int T = scanner.nextInt();
	        
	        // Loop over each test case
	        for (int t = 0; t < T; t++) {
	            // Input the size of the array
	            int N = scanner.nextInt();
	            int[] arr = new int[N]; // Declare the array
	            
	            // Input the elements of the array
	            for (int i = 0; i < N; i++) {
	                arr[i] = scanner.nextInt();
	            }

	            // Get the product array result
	            int[] res = printProductArray(arr);
	            
	            // Output the product array
	            for (int i = 0; i < res.length; i++) {
	                System.out.print(res[i] + " ");
	            }
	            System.out.println(); // New line after each test case result
	        }

	        scanner.close(); // Close the scanner
	    }
	}
}
