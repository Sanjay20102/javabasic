package array;
import java.util.LinkedList;
public class Linked {
	public static void main(String[]args) {
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("Black");
		obj.add("White");
		obj.add("Green");
		obj.add("Yellow");
		obj.addFirst("Blue");
		obj.addLast("Purple");
		obj.removeFirst();
		obj.removeLast();
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		System.out.println(obj);
		
	}
}
