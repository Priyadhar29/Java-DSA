package Project;


	import java.util.Scanner;
	public class arm {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        scanner.close();

	        // Create an array to store Armstrong numbers
	        int[] armstrongNumbers = new int[N]; // Maximum size can be N
	        int count = 0; // To count the number of Armstrong numbers found

	        // Check each number from 1 to N
	        for (int i = 1; i <= N; i++) {
	            if (isArmstrong(i)) {
	                armstrongNumbers[count] = i; // Store the Armstrong number in the array
	                count++; // Increment the count
	            }
	        }

	        // Print all Armstrong numbers found
	        for (int i = 0; i < count; i++) {
	            System.out.print(armstrongNumbers[i] + " ");
	        }
	    }

	    // Function to check if a number is an Armstrong number
	    private static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int sum = 0;
	        int numberOfDigits = countDigits(number);

	        // Calculate the sum of the digits raised to the power of numberOfDigits
	        while (number > 0) {
	            int digit = number % 10;
	            sum += power(digit, numberOfDigits); // Calculate digit^numberOfDigits
	            number /= 10;
	        }

	        // Check if the sum is equal to the original number
	        return sum == originalNumber;
	    }

	    // Function to count the number of digits in a number
	    private static int countDigits(int number) {
	        int count = 0;
	        while (number > 0) {
	            number /= 10;
	            count++;
	        }
	        return count;
	    }

	    // Function to calculate power without using Math.pow
	    private static int power(int base, int exponent) {
	        int result = 1;
	        for (int i = 0; i < exponent; i++) {
	            result *= base; // Multiply base exponent times
	        }
	        return result;
	    }
	}


