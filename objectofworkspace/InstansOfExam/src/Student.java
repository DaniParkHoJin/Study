
public class Student extends Person {
	// 필드 선언
	private int studentNo;

	// 생성자 선언
	public Student() {
		super();
	}

	public Student(int studentNo) {
		super();
		this.studentNo = studentNo;
	}

	public Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	// 메소드 선언
	public void study() {
		System.out.println("공부를 합니다.");
	}

}
