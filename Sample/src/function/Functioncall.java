package function;

public class Functioncall {
	public static int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
	public static int mod(int a,int b) {
		return a%b;
	}
	
	public static void main (String[]args) {
	
		int n1 = 95;
		int n2 = 85;
		int n3 = 64;
		int n4 = 28;
		   
			int addition = add(n1,n2,n3,n4);
			int subtraction = sub(n1,n2);
			int multiplication = mul(n1,n2);
			int division = div(n1,n2);
			int module = mod(n1,n2);
			
		System.out.println(addition);
		System.out.println(subtraction);
		System.out.println(multiplication);
		System.out.println(division);
		System.out.println(module);
	}

}
