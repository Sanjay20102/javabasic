package sample1;

public class Test {
	public static void main (String[]args) {
		
		int year = 2001;

		
		if(year%4==0||year%400==0) {
			System.out.println("it's a leap year");
		}
		else {
				System.out.println("it's not a leap year");
			}
		
		}
}
