
public class Person {
	// 필드 선언
	private String name;// 이름

	// 생성자 선언
	public Person() {
		super();
	}
	// 필드를 모두 받는 생성자
	public Person(String name) {
		super();
		this.name = name;
	}
	// 접근자 이름
	public String getName() {
		return name;
	}
	// 설정자 이름
	public void setName(String name) {
		this.name = name;
	}
	// 메소드 선언
	public void walk() {
		System.out.println("걷습니다. ");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
