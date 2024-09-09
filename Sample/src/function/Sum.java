package function;
import java.util.Scanner;
public class Sum {
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Student Mark:");
		int Marks = obj.nextInt();
		System.out.println("Student Mark"+Marks);
		System.out.println(Marks);
		
	if (Marks<=40) {
		System.out.println("Pass");
	}
	if ((Marks>60) && (Marks<=79)) {
		System.out.println("Grade B");
	}
	if (Marks>=80) {
		System.out.println("Grade A");
	}
	
	}

}
