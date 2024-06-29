package model;

public class StudentVO {
	// �ʵ� ����
	private int no;	// �л� �Ϸù�ȣ
	private String sd_num; // �й�
	private String sd_name; // �̸�
	private String sd_id;	// ���̵�
	private String sd_password; // ��й�ȣ
	private String s_num;	// �а���ȣ
	private String sd_birthday;	// �������
	private String sd_phone; // �ڵ��� ��ȣ
	private String sd_address; // �ּ�
	private String sd_email; // �̸���
	private String sd_date; // �����
	
	// �⺻ ������
	public StudentVO() {
		super();
	}
	// ��� �ʵ带 �޴� ������
	public StudentVO(int no, String sd_num, String sd_name, String sd_id, String sd_password, String s_num,
			String sd_birthday, String sd_phone, String sd_address, String sd_email, String sd_date) {
		super();
		this.no = no;
		this.sd_num = sd_num;
		this.sd_name = sd_name;
		this.sd_id = sd_id;
		this.sd_password = sd_password;
		this.s_num = s_num;
		this.sd_birthday = sd_birthday;
		this.sd_phone = sd_phone;
		this.sd_address = sd_address;
		this.sd_email = sd_email;
		this.sd_date = sd_date;
	}
	// ������
	public int getNo() {
		return no;
	}
	public String getSd_num() {
		return sd_num;
	}
	public String getSd_name() {
		return sd_name;
	}
	public String getSd_id() {
		return sd_id;
	}
	public String getSd_password() {
		return sd_password;
	}
	public String getS_num() {
		return s_num;
	}
	public String getSd_birthday() {
		return sd_birthday;
	}
	public String getSd_phone() {
		return sd_phone;
	}
	public String getSd_address() {
		return sd_address;
	}
	public String getSd_email() {
		return sd_email;
	}
	public String getSd_date() {
		return sd_date;
	}
	// ������
	public void setNo(int no) {
		this.no = no;
	}
	public void setSd_num(String sd_num) {
		this.sd_num = sd_num;
	}
	public void setSd_name(String sd_name) {
		this.sd_name = sd_name;
	}
	public void setSd_id(String sd_id) {
		this.sd_id = sd_id;
	}
	public void setSd_password(String sd_password) {
		this.sd_password = sd_password;
	}
	public void setS_num(String s_num) {
		this.s_num = s_num;
	}
	public void setSd_birthday(String sd_birthday) {
		this.sd_birthday = sd_birthday;
	}
	public void setSd_phone(String sd_phone) {
		this.sd_phone = sd_phone;
	}
	public void setSd_address(String sd_address) {
		this.sd_address = sd_address;
	}
	public void setSd_email(String sd_email) {
		this.sd_email = sd_email;
	}
	public void setSd_date(String sd_date) {
		this.sd_date = sd_date;
	}
	
	@Override
	public String toString() {
		return "StudentVo [no=" + no + ", sd_num=" + sd_num + ", sd_name=" + sd_name + ", sd_id=" + sd_id
				+ ", sd_password=" + sd_password + ", s_num=" + s_num + ", sd_birthday=" + sd_birthday + ", sd_phone="
				+ sd_phone + ", sd_address=" + sd_address + ", sd_email=" + sd_email + ", sd_date=" + sd_date + "]";
	}
	
	
}
