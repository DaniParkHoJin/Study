
public class Undergraduate extends Student {
	// 필드
	private String clubName;
	
	// 기본 생성자
	public Undergraduate() {
		super();
	}
	// 동아리명 생성자
	public Undergraduate(String clubName) {
		super();
		this.clubName = clubName;
	}
	// 부모필드, + 동아리명 생성자
	public Undergraduate(String name, String studentNumber, String department, int grade, int creditHours,
			String clubName) {
		super(name, studentNumber, department, grade, creditHours);
		this.clubName = clubName;
	}
	// 접근자 동아리명
	public String getClubName() {
		return clubName;
	}
	// 설정자 동아리명
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	@Override
	public String toString() {
		return "학부생 [동아리=" + clubName + ", 이름=" + getName() + ", 학번()="
				+ getStudentNumber() + ", 학과=" + getDepartment() + ", 학년=" + getGrade()
				+ ", 이수학점=" + getCreditHours() + "]";
	}
	
	
	
	

}
