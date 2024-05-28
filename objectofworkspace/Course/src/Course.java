
public class Course {
	private String courseName; // 과목명
	private String[] students = new String[100]; // 수강 신청한 학생 저장 배열
	private int numberOfStudents; // 학생 수
	
	// 기본 생성자
	public Course() {
		super();
	}
	// 과목명을 받는 생성자
	public Course(String courseName) {
		this.courseName = courseName;
	}

	// 학생 추가하는 매서드, 수강 신청한 학생 수를 증가하고, 그 학생을 배열에 저장한다.
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {
		// 내용은 각자 완성한다.
	}
	
}
