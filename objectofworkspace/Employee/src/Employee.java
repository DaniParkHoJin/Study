
public class Employee {
	// 필드 정보 입력
	private String name; // 이름을 String
	private String tel;	// 전화번호를 String
	private int sal; // 연봉을 int

	// 기본 생성자
	public Employee() {
		super();
	}
	// 필드 정보 모두를 입력받는 생성자
	public Employee(String name, String tel, int sal) {
		super();
		this.name = name;
		this.tel = tel;
		this.sal = sal;
	}
	// 이름을 조회하는 getName
	public String getName() {
		return name;
	}
	// 전화번호를 조회하는 getTel
	public String getTel() {
		return tel;
	}
	// 연봉을 조회하는 getSal
	public int getSal() {
		return sal;
	}
	// 이름을 설정하는 setName
	public void setName(String name) {
		this.name = name;
	}
	// 전화번호를 설정하는 setTel
	public void setTel(String tel) {
		this.tel = tel;
	}
	// 연봉을 설정하는 setTal
	public void setSal(int sal) {
		this.sal = sal;
	}
	// 이름, 전화번호, 연봉을 출력하는 메서드
	public void printEmployee() {
		System.out.println(this.name + "의 전화번호는 " + this.tel + "이고, 연봉은 " + this.sal +"만원 입니다.");
		}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + this.name + ", tel=" + this.tel + ", sal=" + this.sal + "]";
	}
	
	
	
	
	
	
	

}
