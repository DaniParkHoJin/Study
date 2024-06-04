
public class Student extends Person implements Grade {
	// ÇÊµå
	private int grade;
	private String studentNumber;

	public Student() {
		super();
	}

	public Student(int grade, String studentNumber) {
		super();
		this.grade = grade;
		this.studentNumber = studentNumber;
	}

	public Student(String name, String address, String tel, String email) {
		super(name, address, tel, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getGrade() {
		return grade;
	}

	@Override
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
