
public class Person {
	// �ʵ� ����
	private String name;// �̸�

	// ������ ����
	public Person() {
		super();
	}
	// �ʵ带 ��� �޴� ������
	public Person(String name) {
		super();
		this.name = name;
	}
	// ������ �̸�
	public String getName() {
		return name;
	}
	// ������ �̸�
	public void setName(String name) {
		this.name = name;
	}
	// �޼ҵ� ����
	public void walk() {
		System.out.println("�Ƚ��ϴ�. ");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
