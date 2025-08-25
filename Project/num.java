package Project;
import java.util.Scanner;
public class num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print((2*i+2)+" ");
			}
			System.out.println();
		}
	}

}
