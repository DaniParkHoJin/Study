
public class Employee {
	// 필드
	private String name; // 이름
	private int employeeNumber; // 사번

	// 기본생성자
	public Employee() {
		super();
	}

	// 필드를 모두 받는 생성자
	public Employee(String name, int employeeNumber) {
		super();
		this.name = name;
		this.employeeNumber = employeeNumber;
	}

	// 접근자 이름
	public String getName() {
		return name;
	}

	// 접근자 사번
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	// 설정자 이름
	public void setName(String name) {
		this.name = name;
	}

	// 설정자 사번
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	// 메소드 월급 계산
	public double computeSalary() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeNumber=" + employeeNumber + ", getName()=" + getName()
				+ ", getEmployeeNumber()=" + getEmployeeNumber() + ", computeSalary()=" + computeSalary() + "]";
	}

}
