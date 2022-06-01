import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClonableTest {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar(2040, 10, 22);
		Calendar calendar1 = calendar;
		
		System.out.println(calendar == calendar1);
		
		Calendar calendar2 = (Calendar) calendar.clone();
		System.out.println(calendar2 == calendar);
		System.out.println((calendar.equals(calendar2)));
	}

}
  