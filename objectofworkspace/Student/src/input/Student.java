package input;

public class Student {
	private String name;// 이름
	private String address;// 주소
	private String tel;// 연락처
	private String grade;// 학년
	// 기본 생성자
	public Student() {
		super();
	}
	// 모든 필드를 받는 생성자
	public Student(String name, String address, String tel, String grade) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.grade = grade;
	}
	// 이름 접속자
	public String getName() {
		return name;
	}
	// 주소 접속자
	public String getAddress() {
		return address;
	}
	// 연락처 접속자
	public String getTel() {
		return tel;
	}
	// 학년 접속자
	public String getGrade() {
		return grade;
	}
	// 이름 설정자
	public void setName(String name) {
		this.name = name;
	}
	// 주소 설정자
	public void setAddress(String address) {
		this.address = address;
	}
	// 연락처 설정자
	public void setTel(String tel) {
		this.tel = tel;
	}
	// 학년 설정자
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", tel=" + tel + ", grade=" + grade + "]";
	}
	// 학생성보 출력 메서드
	public void showStudentInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("주소 : " + getAddress());
		System.out.println("연락처 : " + getTel());
		System.out.println( "학년 : " + getGrade());
	}
	
	

}
