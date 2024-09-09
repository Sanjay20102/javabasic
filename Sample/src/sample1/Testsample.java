package sample1;

public class Testsample {
	public static void main (String[]args) {
		
		int year = 2006;
		
		if(year%4==0||year%4000==0) {
			System.out.println("it is leap year");
		}
		else {
			System.out.println("it is not a leap year");
		}
	}
}
