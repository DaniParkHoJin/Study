
public class Student extends Human{
	private String major; // 전공
	
	// 기본 생성자
	public Student() {
		super();
	}
	
	// 
	public Student(String name, int age, String major) {
		super(name, age);
		this.major= major;
	}
	// 전공 접근자
	public String getMajor() {
		return major;
	}
	// 전공 설정자
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [getMajor()=" + getMajor() + ", toString()=" + super.toString() + "]";
	}

	
}
