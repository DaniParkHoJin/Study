
public class Person {
	//�ʵ�
	private String name; // �̸�
	private String address;	// �ּ�
	private String tel;	// ��ȭ��ȣ
	private String email;	// �̸���
	// �⺻ ������
	public Person() {
		super();
	}
	// ��� �ʵ带 �޴� ������
	public Person(String name, String address, String tel, String email) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.email = email;
	}
	// ������ �̸�
	public String getName() {
		return name;
	}
	// ������ �ּ�
	public String getAddress() {
		return address;
	}
	// ������ ��ȭ��ȣ
	public String getTel() {
		return tel;
	}
	// ������ �̸���
	public String getEmail() {
		return email;
	}
	// ������ �̸�
	public void setName(String name) {
		this.name = name;
	}
	// ������ �ּ�
	public void setAddress(String address) {
		this.address = address;
	}
	// ������ ��ȭ��ȣ
	public void setTel(String tel) {
		this.tel = tel;
	}
	// ������ �̸���
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", tel=" + tel + ", email=" + email + "]";
	}
	
	
}
