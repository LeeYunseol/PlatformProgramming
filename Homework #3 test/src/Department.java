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
			System.out.print("\n\n��з� (1) �л�		(2) ����			(3) �����˻�	");
			System.out.print("(0) ����	");
			System.out.print(">> �Է� : ");
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
			System.out.print("\n�л����� �޴� (1) �л� ��ü ���	(2) ��Ƽ Ű���� �˻�  ");
			System.out.print("(0) ����	");
			System.out.print(">> �Է� : ");
			menu = s.nextInt();
			
			switch(menu) {
			case 1: printAllStudent(); break;
			case 2: searchStudent(); break;
			default : break;
		}		
	}
	
	void menuLecture() {
		int menu;
			System.out.print("���񼼺� �޴�	(1) ���� ��ü ��� 	(2) Ű���� �˻�	  ");
			System.out.print("(0) ����	");
			System.out.print(">> �Է� : ");
			menu = s.nextInt();
			
			switch(menu) {
			case 1: printAllLecture(); break;
			case 2: searchLecture("����"); break;
			default : break;
		}		
	}
	
	void menuSearch() {
		int menu;
			System.out.print("�����˻� �޴� (1) ���� ������		(2) ���Ϻ� ������  ");
			System.out.print("         (3) Ÿ�г� ���� ������ ��");
			System.out.print("(0) ����");
			System.out.print(">> �Է� : ");
			menu = s.nextInt();
			
			switch(menu) {
			case 1: searchLecture("������"); break;
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
			System.out.println("=========���Ϻ� �л� �˻�(end �Է� �� ��)=========");
			System.out.print(">> ���� : ");
			kwd = s.next();
			
			if(kwd.contentEquals("end"))
				break;
			System.out.printf("%s���� ������ : ", kwd);
			
			if(kwd.contentEquals("��") || kwd.contentEquals("ȭ") || kwd.contentEquals("��")
					|| kwd.contentEquals("��") || kwd.contentEquals("��")) {
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
			System.out.println("=========���� �˻�(end �Է� �� ��)=========");
			System.out.print("���� Ű���� �˻� : ");
			kwd = s.next();
		
			if(kwd.contentEquals("end"))
				break;
			
			ArrayList<Lecture> lecture = new ArrayList<>();
			lecture = existLecture(kwd);
			if(lecture.size() == 0)
				break;
			
			if(what.contentEquals("����")) {
				for(Lecture lec: lecture)
					lec.print();
			}
			if(what.contentEquals("������")) {
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
			System.out.print("�Է� (end �Է½� ���� ȭ��) >> ");
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