import java.util.*;

public class StudentManager {
	
	private List<Student> students = new ArrayList<Student>();
	private static StudentManager manager;
	
	private StudentManager() {
		
	}
	
	public static StudentManager getInstance() {
		if (manager == null)
			manager = new StudentManager();
		return manager;
	}
	
	//삽입C
	public void addStudent(Student student) {
		students.add(student);
		
		// 내가 따로 조건을 걸었다면 true/false
		
		
	}
	
	//조회R
	// 1. 전체목록 조회
	public List<Student> getAllStudent() {
		return students;
	}
	
	// 2. 이름 검색. 
	public Student getStudentName(String name) throws NoSuchNameException {
		List<Student> nameStudents = new ArrayList<>();
		for (Student student : students) {
			if (student.getName().contains(name))
				nameStudents.add(student);
		}
		
		if (nameStudents.size() == 0)
			// 예외처리 만들어주기.
			throw new NoSuchNameException;
			
		return nameStudents.get(0);
	}
	
	
	
	//수정U
	
	// 전공변경
	public Student changeMajor (String major, String name) {
		// 해당 이름을 가진 목록을 반환해주는데, 중복이름은 없다는 가정하라 배열에 값이 하나 저장 돼있을 것.
		// 첫번째 값을 가져와서 저장함.
		Student st = getStudentName(name).get(0);
		st.setMajor(major);
		
		return st;
	}
	
	//삭제D
	public void removeStudent(String name) {
		for (int i = students.size() - 1; i >= 0; i--) {
			if (students.get(i).getName().equals(name))
				students.remove(i);
		}
	}
	
	

}
