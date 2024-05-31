
public class Graduate extends Student {

	// �ʵ�
	private boolean type;// ���� ����
	private double scholarshipRate; // ���б� ����
	// ������ �⺻

	public Graduate() {
		super();
	}

	// ������ Ÿ��, ���б� ����
	public Graduate(boolean type, double scholarshipRate) {
		super();
		this.type = type;
		this.scholarshipRate = scholarshipRate;

	}
	// ������ Students �ʵ�  + ��������, ���б� ����
	public Graduate(String name, String studentNumber, String department, int grade, int creditHours, boolean type, double scholarshipRate) {
		super(name, studentNumber, department, grade, creditHours);
		this.type = type;
		this.scholarshipRate = scholarshipRate;
	}
	// ������ ���б� ����
	public double getScholarshipRate() {
		return scholarshipRate;
	}
	// ������ ���� ����
	public boolean isType() {
		return type;
	}
	// ������ ���� ����
	public void setType(boolean type) {
		this.type = type;
	}
	// ������ ���б� ����
	public void setScholarshipRate(double scholarshipRate) {
		this.scholarshipRate = scholarshipRate;
	}

	@Override
	public String toString() {
		return "���п��� [����=" + type + ", ���б� ����=" + scholarshipRate + ", �̸�=" + getName()
				+ ", �й�=" + getStudentNumber() + ", �а�=" + getDepartment()
				+ ", �г�=" + getGrade() + ", �̼�����=" + getCreditHours() + "]";
	}

}
