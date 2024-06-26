package model;

public class LessonVo {
	// �ʵ� ����
	private int no; // ���� �Ϸù�ȣ
	private String l_abbre; // ���� ���
	private String l_name; // �����

	// �⺻ ������
	public LessonVo() {
		super();
	}

	// ��� �ʵ带 �޴� ������
	public LessonVo(int no, String l_abbre, String l_name) {
		super();
		this.no = no;
		this.l_abbre = l_abbre;
		this.l_name = l_name;
	}

	// ������
	public int getNo() {
		return no;
	}

	public String getL_abbre() {
		return l_abbre;
	}

	public String getL_name() {
		return l_name;
	}

	// ������
	public void setNo(int no) {
		this.no = no;
	}

	public void setL_abbre(String l_abbre) {
		this.l_abbre = l_abbre;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	@Override
	public String toString() {
		return "LessonVo [l_abbre=" + l_abbre + ", l_name=" + l_name + "]";
	}

}
