package array;
import java.util.HashMap;
public class Hash {
	public static void main(String[]args) {
		HashMap<String,Integer> obj = new HashMap<String,Integer>();
		obj.put("Delhi",1);
		obj.put("Bangalore",2);
		obj.put("Tamilnadu",3);
		obj.replace("Delhi",3);
		obj.remove("Bangalore");

		System.out.println(obj);
	}
}
