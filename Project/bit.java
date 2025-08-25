package Project;

public class bit {
	
	    public static void main(String[] args) {
	        int decimalNumber = 10; // Example decimal number
	        String binaryString = decimalToBinary(decimalNumber);
	        System.out.println("Decimal: " + decimalNumber + " -> Binary: " + binaryString);
	    }

	    public static String decimalToBinary(int decimal) {
	        StringBuilder binary = new StringBuilder();
	        
	        // Handle the case for 0 explicitly
	        if (decimal == 0) {
	            return "0";
	        }

	        while (decimal >=1) {
	            // Prepend the remainder (0 or 1) to the binary string
	            binary.insert(0, decimal % 2);
	            decimal = decimal / 2; // Divide by 2 to get the next bit
	        }
	        
	        return binary.toString(); // Convert StringBuilder to String
	    }
}
