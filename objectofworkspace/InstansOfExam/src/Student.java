
public class Student extends Person {
	// �ʵ� ����
	private int studentNo;

	// ������ ����
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

	// �޼ҵ� ����
	public void study() {
		System.out.println("���θ� �մϴ�.");
	}

}
