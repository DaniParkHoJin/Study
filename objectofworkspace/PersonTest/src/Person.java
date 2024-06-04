
public class Person {
	//필드
	private String name; // 이름
	private String address;	// 주소
	private String tel;	// 전화번호
	private String email;	// 이메일
	// 기본 생성자
	public Person() {
		super();
	}
	// 모든 필드를 받는 생성자
	public Person(String name, String address, String tel, String email) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.email = email;
	}
	// 접근자 이름
	public String getName() {
		return name;
	}
	// 접근자 주소
	public String getAddress() {
		return address;
	}
	// 접근자 전화번호
	public String getTel() {
		return tel;
	}
	// 접근자 이메일
	public String getEmail() {
		return email;
	}
	// 설정자 이름
	public void setName(String name) {
		this.name = name;
	}
	// 설정자 주소
	public void setAddress(String address) {
		this.address = address;
	}
	// 설정자 전화번호
	public void setTel(String tel) {
		this.tel = tel;
	}
	// 설정자 이메일
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", tel=" + tel + ", email=" + email + "]";
	}
	
	
}
