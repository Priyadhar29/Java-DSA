package Project;
class calc{
	int a=5;
	int b=10;
	void add() {
		int c=a+b;
		System.out.println(c);
	}
	void sub(int n,int m) {
		int o=m-n;
		System.out.println(o);
	}
	int mul() {
		int ans= a*b;
		return ans;
	}
	int div(int a1,int b1) {
		int divi = a1/b1;
		return divi;
	}
}
public class meth {
	public static void main(String[] args) {
		calc cal=new calc();
		cal.add();
		cal.sub(20, 30);
	    cal.mul();
		System.out.println(cal.mul());
		cal.div(30, 2);
		System.out.println(cal.div(30, 2));
	}

}
