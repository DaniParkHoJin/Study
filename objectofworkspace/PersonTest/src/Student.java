
public class Student extends Person implements Grade {
	// �ʵ�
	private int grade;
	private String studentNumber;
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	// �⺻������
	public Student() {
		super();
	}
	// �ʵ带 ��� �޴� ������
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
