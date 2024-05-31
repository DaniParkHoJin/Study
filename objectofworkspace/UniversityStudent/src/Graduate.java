
public class Graduate extends Student {

	// 필드
	private boolean type;// 조교 유형
	private double scholarshipRate; // 장학금 비율
	// 생성자 기본

	public Graduate() {
		super();
	}

	// 생성자 타입, 장학금 비율
	public Graduate(boolean type, double scholarshipRate) {
		super();
		this.type = type;
		this.scholarshipRate = scholarshipRate;

	}
	// 생성자 Students 필드  + 조교유형, 장학금 비율
	public Graduate(String name, String studentNumber, String department, int grade, int creditHours, boolean type, double scholarshipRate) {
		super(name, studentNumber, department, grade, creditHours);
		this.type = type;
		this.scholarshipRate = scholarshipRate;
	}
	// 접근자 장학금 비율
	public double getScholarshipRate() {
		return scholarshipRate;
	}
	// 접근자 조교 유형
	public boolean isType() {
		return type;
	}
	// 설정자 조교 유형
	public void setType(boolean type) {
		this.type = type;
	}
	// 설정자 장학금 비율
	public void setScholarshipRate(double scholarshipRate) {
		this.scholarshipRate = scholarshipRate;
	}

	@Override
	public String toString() {
		return "대학원생 [유형=" + type + ", 장학금 비율=" + scholarshipRate + ", 이름=" + getName()
				+ ", 학번=" + getStudentNumber() + ", 학과=" + getDepartment()
				+ ", 학년=" + getGrade() + ", 이수학점=" + getCreditHours() + "]";
	}

}
