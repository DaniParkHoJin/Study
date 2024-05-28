
public class Employee {
	// �ʵ� ���� �Է�
	private String name; // �̸��� String
	private String tel;	// ��ȭ��ȣ�� String
	private int sal; // ������ int

	// �⺻ ������
	public Employee() {
		super();
	}
	// �ʵ� ���� ��θ� �Է¹޴� ������
	public Employee(String name, String tel, int sal) {
		super();
		this.name = name;
		this.tel = tel;
		this.sal = sal;
	}
	// �̸��� ��ȸ�ϴ� getName
	public String getName() {
		return name;
	}
	// ��ȭ��ȣ�� ��ȸ�ϴ� getTel
	public String getTel() {
		return tel;
	}
	// ������ ��ȸ�ϴ� getSal
	public int getSal() {
		return sal;
	}
	// �̸��� �����ϴ� setName
	public void setName(String name) {
		this.name = name;
	}
	// ��ȭ��ȣ�� �����ϴ� setTel
	public void setTel(String tel) {
		this.tel = tel;
	}
	// ������ �����ϴ� setTal
	public void setSal(int sal) {
		this.sal = sal;
	}
	// �̸�, ��ȭ��ȣ, ������ ����ϴ� �޼���
	public void printEmployee() {
		System.out.println(this.name + "�� ��ȭ��ȣ�� " + this.tel + "�̰�, ������ " + this.sal +"���� �Դϴ�.");
		}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + this.name + ", tel=" + this.tel + ", sal=" + this.sal + "]";
	}
	
	
	
	
	
	
	

}
