package model;

public class SubjectVO {
	// �ʵ� ����
	private int no; // �а� �Ϸù�ȣ
	private String s_num; //  �а� ��ȣ
	private String s_name; // �а���
	// �⺻ ������
	public SubjectVO() {
		super();
	}
	// �ʵ带 ��� �޴� ������
	public SubjectVO(int no, String s_num, String s_name) {
		super();
		this.no = no;
		this.s_num = s_num;
		this.s_name = s_name;
	}
	// ������
	public int getNo() {
		return no;
	}
	public String getS_num() {
		return s_num;
	}
	public String getS_name() {
		return s_name;
	}
	// ������
	public void setNo(int no) {
		this.no = no;
	}
	public void setS_num(String s_num) {
		this.s_num = s_num;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	@Override
	public String toString() {
		return "SubjectVo [no=" + no + ", s_num=" + s_num + ", s_name=" + s_name + "]";
	}
	
	
	
	
}
