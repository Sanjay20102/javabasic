package array;
import java.util.Scanner;
public class Trycatch {
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		
		try {
			int age = obj.nextInt();
			System.out.println("Age:"+age);
		}catch (Exception e) {
			System.out.println("Something went wrong");
			
		}
	}

}
