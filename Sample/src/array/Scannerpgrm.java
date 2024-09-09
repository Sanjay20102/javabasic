package array;
import java.util.Scanner;
public class Scannerpgrm {
	public static void main(String[]args){

	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the user details");
	String name = obj.nextLine();
	System.out.println("User name is:"+name);
	int age = obj.nextInt();
	System.out.println("User age is:"+age);
	boolean mybool = obj.nextBoolean();
	System.out.println("User is currenly working:"+mybool);
	double Height =  obj.nextDouble();
	System.out.println("User height is:"+Height);
	long Salary = obj.nextLong();
	System.out.println("User salary is:"+Salary);
}
}
