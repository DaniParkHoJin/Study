import java.io.Serializable;

public class PhoneInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4676398795181843053L;
	// 필드
	private String name; // 이름
	private String phoneNumber; // 전화번호
	// 생성자

	public PhoneInfo() {
		super();
	}

	// 필드를 모두 받는 생성자
	public PhoneInfo(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	// 접근자 이름
	public String getName() {
		return name;
	}

	// 접근자 전화번호
	public String getPhoneNumber() {
		return phoneNumber;
	}

	// 설정자 이름
	public void setName(String name) {
		this.name = name;
	}

	// 설정자 전화번호
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

	public void showPhoneInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);

	}

	public int hashCode() {
		return name.hashCode();

	}

	public boolean equals(Object obj) {
		PhoneInfo cmp = (PhoneInfo) obj;
		if (name.compareTo(cmp.name) == 0)
			return true;
		else
			return false;
	}

}
