import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Student {
	int id;
	String name;
	String phone;
	int year;
	ArrayList<Lecture> registeredList = new ArrayList<>();
	
	public Student(int id2) {
		id = id2;
	}
	
	public boolean matches(String kwd) {
		if(name.contains(kwd)) return true;
		if(kwd.length()>3 && (id+"").contains(kwd)) return true;
		if(kwd.length()>3 && phone.contains(kwd)) return true;
		if((year+"").contentEquals(kwd)) return true;
		return false;
	}

	public boolean matches(String[] kwdArr) {
		for(String kwd: kwdArr) {
			if(name.contains(kwd)) return true;
			if(kwd.length()>3 && (id+"").contains(kwd)) return true;
			if(kwd.length()>3 && phone.contains(kwd)) return true;
			if((year+"").contentEquals(kwd)) return true;
			for(Lecture lec: registeredList) {
				if(containsLecture(lec)) return true;
			}
		}
		return false;
	}

	public boolean containsLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		for(Lecture lec : registeredList) {
			if(lec.equals(lecture))
				return true;
		}
		return false;
	}	
	
	void read(Scanner s, Department department) {
		//id = s.nextInt();
		name = s.next();
		phone = s.next();
		year = s.nextInt();
		
		String code = null;
		ArrayList<Lecture> lec = null;
		
		while(true) {
			code = s.next();
			if(code.contentEquals("0")) break;
			lec = department.existLecture(code);
			if(lec.size() == 0) {
				System.out.printf("%s는 없는 과목 코드입니다.", code);
				System.out.println();
				continue;
			}
			registeredList.addAll(lec);
		}
	}
	
	void print() {
		System.out.printf("%d %s %s %d년\n", id, name, phone, year);
	}
	void print_lecture() {
		for(Lecture lec: registeredList) {
			System.out.print("\t");
			lec.print();
		}
		System.out.println();
	}
}