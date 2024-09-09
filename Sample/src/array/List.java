package array;
import java.util.ArrayList;
public class List {
	public static void main(String[]args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Black");
		obj.add("White");
		obj.add("Green");
		obj.add("Yellow");
		obj.set(3,"Blue");
		obj.remove(2);
		System.out.println(obj.get(1));
		System.out.println(obj);
		
	}

}
