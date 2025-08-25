package Project;

public class factorial {
	static int fact(int n){
		if(n==0||n==1) {
			return 1;
		}
		return n*fact(n-1);
	 }
public static void main(String[] args) {
	int n=5;
	for(int i=0;i<=n;i++) {
	System.out.print(factorial.fact(i)+" ");
	}
}
}
