package market;
// 고객 정보를 저장하는 User class 클래스 인스턴스화 하면 개인의 정보가 저장된다.
public class User {
	private String userName;//이름
	private String userTel;// 휴대전화번호
	private String userAddress; //주소
	private int grade;// 등급(User일반 0, admin관리자 1)
	
	// 기본 생성자
	public User() {
		super();
	}

	public User(String userName, String userTel, String userAddress, int grade) {
		super();
		this.userName = userName;
		this.userTel = userTel;
		this.userAddress = userAddress;
		this.grade = grade;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public int getGrade() {
		return grade;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userTel=" + userTel + ", userAddress=" + userAddress + ", grade="
				+ grade + "]";
	}
	
	
	
}
