package loop;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class Datetime {
	public static void main (String[]args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime obj = LocalDateTime.now();
		System.out.println(obj);
	}

}
