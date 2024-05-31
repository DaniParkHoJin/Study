
public class SalariedEmployee extends Employee {
	// 필드
	private double salary;// 월급

	// 기본 생성자
	public SalariedEmployee() {
		super();
	}
	// 자신 필드 생성자
	public SalariedEmployee(double salary) {
		super();
		this.salary = salary;
	}

	// 자신 필드와 Employee 필드 생성자
	public SalariedEmployee(String name, int employeeNumber, double salary) {
		super(name, employeeNumber);
		this.salary = salary;
	}

	// 접근자 월급
	public double getSalary() {
		return salary;
	}

	// 설정자 월급
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// 매서드 재정의
	@Override
	public double computeSalary() {
		return this.salary;
	}
	@Override
	public String toString() {
		return "정규직" + getName()+"님의 사원번호는 " + getEmployeeNumber() + "이며, 월급은 " + computeSalary()+ "원 입니다.";
	}



}
