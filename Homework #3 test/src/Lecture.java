import java.util.ArrayList;
import java.util.Scanner;

public class Lecture {
	
	String code;
	String title;
	int year;
	String date;
	String time;
	
	Lecture(String code){
		this.code = code;
	}
	
	public boolean matches(String kwd) {
	// TODO Auto-generated method stub
		if(code.contentEquals(kwd))
			return true;
		if(title.contains(kwd))
			return true;
		if(kwd.contentEquals(""+year))
			return true;
		if(kwd.contentEquals(date))
			return true;
		if(kwd.contentEquals(time))
			return true;
		return false;
	}
	
	void read(Scanner s) {
		title = s.next();
		year = s.nextInt();
		date = s.next();
		time = s.next();
	}
	
	void print() {
		System.out.printf("[%s] %s %d³â %s /%s\n",
				code, title, year, date, time);
	}
	
}