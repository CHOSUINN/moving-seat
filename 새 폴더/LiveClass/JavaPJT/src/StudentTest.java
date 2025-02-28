import java.util.*;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		private static final StudentManager2 sm = StudentManager2.getInstance();
		
		int sel;
		do {
			System.out.println("학생 관리 프로그램 (번호 입력");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체조회");
			System.out.println("3. 학생 검색(이름)");
			System.out.println("4. 전공 변경");
			System.out.println("5. 학생 삭제");
			System.out.println("6. 저장");
			System.out.println("0. 종료");
			sel = sc.nextInt();	
			///
			
			if (sel == 1 ) {
				System.out.println("학생 추가하겠습니다.");
				System.out.println("이름: ");
				String name = sc.next();
				System.out.println("나이 : ");
				int age = sc.nextInt();
				System.out.println("전공 : ");
				String major = sc.next();
				sm.addStudent(new Student(name, age, major));
				
			} else if (sel == 2) {
				for(Student st : sm.getAllStudent())
					System.out.println(st);
			} else if (sel == 3) {
				
				String name = sc.next();
				Student st = sm.getStudentName(name);
				if (st == null) {
					System.out.println("그런 학생 없음");
				} else {
					System.out.println("조회한 학생은 : ");
					System.out.println(st);
				}
			} else if (sel == 4) {
				
				
			} else if (sel == 5) {
				
			} else if (sel == 6) {
				sm.saveData();
			}
		} while(sel != 0);
		
		
		
		sc.close();	
	}
}
