package array;
import java.util.HashMap;
public class Sum {
	public static void main(String[]args) {
		
		HashMap<String,Integer> obj = new HashMap<String,Integer>();
		obj.put("Sanjay",12);
		obj.put("Rahul",13);
		obj.put("Ashwin",14);
		obj.replace("Ashwin",11);
		obj.remove("Rahul");

		System.out.println(obj);
	}

}
