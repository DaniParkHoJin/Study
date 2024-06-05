
public class Student extends Person implements Grade {
	// 필드
	private int grade;
	private String studentNumber;
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	// 기본생성자
	public Student() {
		super();
	}
	// 필드를 모두 받는 생성자
	public Student(int grade, String studentNumber) {
		super();
		this.grade = grade;
		this.studentNumber = studentNumber;
	}

	public Student(String name, String address, String tel, String email, int grade, String studentNumber) {
		super(name, address, tel, email);
		this.grade = grade;
		this.studentNumber = studentNumber;
	}

	@Override
	public int getGrade() {
		return grade;
	}

	@Override
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", studentNumber=" + studentNumber + ", toString()=" + super.toString()
				+ "]";
	}

}
