import java.util.ArrayList;
import java.util.Scanner;

public class Department {
	Scanner s = new Scanner(System.in);

	ArrayList<Student> studentList = new ArrayList<>();
	ArrayList<Lecture> lectureList = new ArrayList<>();
	
	void run() {

		readAllLecture();
		readAllStudent();

		menu();
	}
	
	void menu() {
		int menu;
		while(true) {
			System.out.print("\n\n대분류 (1) 학생		(2) 과목			(3) 연관검색	");
			System.out.print("(0) 종료	");
			System.out.print(">> 입력 : ");
			menu = s.nextInt();
			
			switch(menu) {
			case 1: menuStudent(); break;
			case 2: menuLecture(); break;
			case 3: menuSearch(); break;
			default: System.exit(0); break;
			}
		}
	}
	
	void menuStudent() {
		int menu;
			System.out.print("\n학생세부 메뉴 (1) 학생 전체 출력	(2) 멀티 키워드 검색  ");
			System.out.print("(0) 이전	");
			System.out.print(">> 입력 : ");
			menu = s.nextInt();
			
			switch(menu) {
			case 1: printAllStudent(); break;
			case 2: searchStudent(); break;
			default : break;
		}		
	}
	
	void menuLecture() {
		int menu;
			System.out.print("과목세부 메뉴	(1) 과목 전체 출력 	(2) 키워드 검색	  ");
			System.out.print("(0) 이전	");
			System.out.print(">> 입력 : ");
			menu = s.nextInt();
			
			switch(menu) {
			case 1: printAllLecture(); break;
			case 2: searchLecture("강의"); break;
			default : break;
		}		
	}
	
	void menuSearch() {
		int menu;
			System.out.print("연관검색 메뉴 (1) 과목별 수강생		(2) 요일별 수강생  ");
			System.out.print("         (3) 타학년 과목 수강생 수");
			System.out.print("(0) 이전");
			System.out.print(">> 입력 : ");
			menu = s.nextInt();
			
			switch(menu) {
			case 1: searchLecture("수강생"); break;
			case 2: searchDay();
			case 3: differentGrade();
			default : break;
		}		
	}
	
	void differentGrade() {		
		for(Lecture lec: lectureList) {
			lec.print();
			int count = 0;
			for(Student st: studentList) {
				if(st.containsLecture(lec)){
					if((st.year) != (lec.year)) {
						System.out.print(st.name+" ");
						count++;
					}
				}
			}
			System.out.println("("+count+")");
			System.out.println();
			}
	}
	
	
	void searchDay() {
		String kwd;
		while(true) {
			System.out.println("=========요일별 학생 검색(end 입력 시 끝)=========");
			System.out.print(">> 요일 : ");
			kwd = s.next();
			
			if(kwd.contentEquals("end"))
				break;
			System.out.printf("%s요일 수강생 : ", kwd);
			
			if(kwd.contentEquals("월") || kwd.contentEquals("화") || kwd.contentEquals("수")
					|| kwd.contentEquals("목") || kwd.contentEquals("금")) {
				for(Student st: studentList) {
					for(Lecture lec: existLecture(kwd)) {
						if(st.containsLecture(lec))
							System.out.print(st.name+" ");
					}
				}
			}
			System.out.println();
		}
		
	}
	
	void searchLecture(String what) {
		String kwd;
		
		while(true) {
			kwd = s.nextLine();
			System.out.println("=========과목 검색(end 입력 시 끝)=========");
			System.out.print("과목 키워드 검색 : ");
			kwd = s.next();
		
			if(kwd.contentEquals("end"))
				break;
			
			ArrayList<Lecture> lecture = new ArrayList<>();
			lecture = existLecture(kwd);
			if(lecture.size() == 0)
				break;
			
			if(what.contentEquals("과목")) {
				for(Lecture lec: lecture)
					lec.print();
			}
			if(what.contentEquals("수강생")) {
				for(Lecture lec: lecture) {
					lec.print();
					for(Student st: studentList) {
						if(st.containsLecture(lec))
							st.print();
					}
					System.out.println();
				}
			}
		}
	}
	
	void searchStudent() {
		String kwd;
		s.nextLine();
		String[] kwdArr;
		while(true) {
			System.out.print("입력 (end 입력시 이전 화면) >> ");
			kwd = s.nextLine();
			
			if(kwd.contentEquals("end")) break;
			
			kwdArr = kwd.split(" ");
			for(Student st: studentList) {
				if(st.matches(kwdArr)) st.print();
			}
		}
	}

	public ArrayList<Lecture> existLecture(String kwd) {		
		ArrayList<Lecture> existLecture = new ArrayList<>();
		
		for(Lecture lec: lectureList)
			if(lec.matches(kwd))
				existLecture.add(lec);		

		return existLecture;
	}	
	
	void readAllStudent() {
		int id = 0;
		while(true) {
			id = s.nextInt();
			if(id == 0) break;
			
			Student st = new Student(id);
			st.read(s, this);
			studentList.add(st);		
		}
	}
	
	void printAllStudent() {
		for(Student st: studentList) {
			st.print();
			st.print_lecture();
		}
		
	}
	
	void readAllLecture() {
		String code = null;
		while(true) {
			code = s.next();
			if(code.contentEquals("end")) break;
			
			Lecture lec = new Lecture(code);
			lec.read(s);
			lectureList.add(lec);		
		}
	}
	
	void printAllLecture() {
		for(Lecture lec: lectureList) {
			lec.print();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department m = new Department();
		m.run();
	}


}