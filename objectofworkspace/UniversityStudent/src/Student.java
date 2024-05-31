
public class Student {
	// 필드
	private String name; // 이름
	private String studentNumber; // 학번
	private String department;	// 학과
	private int grade; // 학년
	private int creditHours; // 이수학점
	// 기본 생성자
	public Student() {
		super();
	}
	// 모든 필드를 받는 생성자
	public Student(String name, String studentNumber, String department, int grade, int creditHours) {
		super();
		this.name = name;
		this.studentNumber = studentNumber;
		this.department = department;
		this.grade = grade;
		this.creditHours = creditHours;
	}
	// 접근자 이름
	public String getName() {
		return name;
	}
	// 접근자 학생
	public String getStudentNumber() {
		return studentNumber;
	}
	// 접근자 소속학과
	public String getDepartment() {
		return department;
	}
	// 접근자 학년
	public int getGrade() {
		return grade;
	}
	
	// 접근자 이수학점
	public int getCreditHours() {
		return creditHours;
	}
	// 설정자 이름
	public void setName(String name) {
		this.name = name;
	}
	// 설정자 학번
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	// 설정자 소속 학과
	public void setDepartment(String department) {
		this.department = department;
	}
	// 설정자 학년
	public void setGrade(int grade) {
		this.grade = grade;
	}
	// 설정자 이수학점
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	
	@Override
	public String toString() {
		return "학생 [이름=" + name + ", 학번=" + studentNumber + ", 학과=" + department + ", 학년="
				+ grade + ", 이수학점=" + creditHours + "]";
	}
	
	
	
	

}
