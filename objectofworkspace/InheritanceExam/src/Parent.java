
public class Parent {
	private String name; // �̸�
	private String age;	// ����
	private String sex;	// ����
	
	protected int moneyCard; // 
	
	
	// �⺻ ������
	public Parent() {
		super();
	}
	// �ʵ� ��θ� �޴� ������
	public Parent(String name, String age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
}
