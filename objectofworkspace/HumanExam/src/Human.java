
public class Human {
	
	private String name; // 이름
	private int age;	// 나잉
	
	// 기본 생성자
	public Human() {
		super();
	}
	
	// 두 가지 모두를 받는 생성자
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	// 이름 설정자
	public void setName(String name) {
		this.name = name;
	}
	// 나이 설정자
	public void setAge(int age) {
		this.age = age;
	}
	// 이름 접근자
	public String getName() {
		return name;
	}
	// 나이 접근자
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
