
public class Parent {
	private String name; // 이름
	private String age;	// 나이
	private String sex;	// 성별
	
	protected int moneyCard; // 
	
	
	// 기본 생성자
	public Parent() {
		super();
	}
	// 필드 모두를 받는 생성자
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
