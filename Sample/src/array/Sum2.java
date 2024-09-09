package array;
import java.util.ArrayList;
public class Sum2 {
	public static void main(String[]args) {
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(1);
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.set(0,0);
		obj.remove(3);
		System.out.println(obj.get(1));
		System.out.println(obj);
		
	}

}
