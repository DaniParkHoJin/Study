package input;

public class Student {
	private String name;// �̸�
	private String address;// �ּ�
	private String tel;// ����ó
	private String grade;// �г�
	// �⺻ ������
	public Student() {
		super();
	}
	// ��� �ʵ带 �޴� ������
	public Student(String name, String address, String tel, String grade) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.grade = grade;
	}
	// �̸� ������
	public String getName() {
		return name;
	}
	// �ּ� ������
	public String getAddress() {
		return address;
	}
	// ����ó ������
	public String getTel() {
		return tel;
	}
	// �г� ������
	public String getGrade() {
		return grade;
	}
	// �̸� ������
	public void setName(String name) {
		this.name = name;
	}
	// �ּ� ������
	public void setAddress(String address) {
		this.address = address;
	}
	// ����ó ������
	public void setTel(String tel) {
		this.tel = tel;
	}
	// �г� ������
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", tel=" + tel + ", grade=" + grade + "]";
	}
	// �л����� ��� �޼���
	public void showStudentInfo() {
		System.out.println("�̸� : " + getName());
		System.out.println("�ּ� : " + getAddress());
		System.out.println("����ó : " + getTel());
		System.out.println( "�г� : " + getGrade());
	}
	
	

}
