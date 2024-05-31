
public class Student {
	// �ʵ�
	private String name; // �̸�
	private String studentNumber; // �й�
	private String department;	// �а�
	private int grade; // �г�
	private int creditHours; // �̼�����
	// �⺻ ������
	public Student() {
		super();
	}
	// ��� �ʵ带 �޴� ������
	public Student(String name, String studentNumber, String department, int grade, int creditHours) {
		super();
		this.name = name;
		this.studentNumber = studentNumber;
		this.department = department;
		this.grade = grade;
		this.creditHours = creditHours;
	}
	// ������ �̸�
	public String getName() {
		return name;
	}
	// ������ �л�
	public String getStudentNumber() {
		return studentNumber;
	}
	// ������ �Ҽ��а�
	public String getDepartment() {
		return department;
	}
	// ������ �г�
	public int getGrade() {
		return grade;
	}
	
	// ������ �̼�����
	public int getCreditHours() {
		return creditHours;
	}
	// ������ �̸�
	public void setName(String name) {
		this.name = name;
	}
	// ������ �й�
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	// ������ �Ҽ� �а�
	public void setDepartment(String department) {
		this.department = department;
	}
	// ������ �г�
	public void setGrade(int grade) {
		this.grade = grade;
	}
	// ������ �̼�����
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	
	@Override
	public String toString() {
		return "�л� [�̸�=" + name + ", �й�=" + studentNumber + ", �а�=" + department + ", �г�="
				+ grade + ", �̼�����=" + creditHours + "]";
	}
	
	
	
	

}
