package Project;
import java.util.*;
public class MinMaxSum {
    
    public static void main(String[] args) {
    	System.out.print("Number of n values: ");
    	Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Array values: ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
        	arr[i]=scanner.nextInt();
        }

        // Call the method to calculate max and min sums
        long[] results = calculateMinMaxSum(arr, n);
        
        // Output the results
        
        System.out.println("Maximum sum of n-1 elements: " + results[0]);
        System.out.println("Minimum sum of n-1 elements: " + results[1]);
    }

    public static long[] calculateMinMaxSum(int[] arr, int n) {
        long totalSum = 0;
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        // Calculate total sum, min and max elements using a for loop
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        System.out.println(totalSum);
        // Calculate max and min sum of n-1 elements
        long maxSum = totalSum - minElement;
        long minSum = totalSum - maxElement;

        return new long[]{maxSum, minSum}; // Return results as an array
    }
}