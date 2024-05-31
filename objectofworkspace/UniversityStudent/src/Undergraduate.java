
public class Undergraduate extends Student {
	// �ʵ�
	private String clubName;
	
	// �⺻ ������
	public Undergraduate() {
		super();
	}
	// ���Ƹ��� ������
	public Undergraduate(String clubName) {
		super();
		this.clubName = clubName;
	}
	// �θ��ʵ�, + ���Ƹ��� ������
	public Undergraduate(String name, String studentNumber, String department, int grade, int creditHours,
			String clubName) {
		super(name, studentNumber, department, grade, creditHours);
		this.clubName = clubName;
	}
	// ������ ���Ƹ���
	public String getClubName() {
		return clubName;
	}
	// ������ ���Ƹ���
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	@Override
	public String toString() {
		return "�кλ� [���Ƹ�=" + clubName + ", �̸�=" + getName() + ", �й�()="
				+ getStudentNumber() + ", �а�=" + getDepartment() + ", �г�=" + getGrade()
				+ ", �̼�����=" + getCreditHours() + "]";
	}
	
	
	
	

}
