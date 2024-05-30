package market;
// �� ������ �����ϴ� User class Ŭ���� �ν��Ͻ�ȭ �ϸ� ������ ������ ����ȴ�.
public class User {
	private String userName;//�̸�
	private String userTel;// �޴���ȭ��ȣ
	private String userAddress; //�ּ�
	private int grade;// ���(User�Ϲ� 0, admin������ 1)
	
	// �⺻ ������
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
