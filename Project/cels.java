package Project;
import java.util.Scanner;
public class cels {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.print("Enter celcius:");
	int c=sc.nextInt();
	float f=(c * 9/5f) + 32;
	System.out.printf("%.4f",f);
	}
}
