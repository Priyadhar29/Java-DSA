package Project;
import java.util.Scanner;
public class holl_dia {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int space=1;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==1||i==n+1||j==i||j==1) {
					System.out.print("* ");
					}else {
						System.out.print("  ");
					}
			}
			System.out.println();
		}
		for(int i=n-1;i>=0;i--) {
			for(int space=1;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==1||i==n||j==i||j==1) {
					System.out.print("* ");
					}else {
						System.out.print("  ");
					}
			}
			System.out.println();
		}
	}

}
