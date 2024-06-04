package hashcodeExam;

public class Student {
	// �ʵ�
	private int no; // ����
	private String name;	// �̸�

	// �ʵ带 ��� ���� ������
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	// ������ no
	public int getNo() {
		return no;
	}
	// ������ �̸�
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student target) {
			if (no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	
	

}
