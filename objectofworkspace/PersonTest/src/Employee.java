import java.util.Date;

public class Employee extends Person {
	private boolean office;// 사무실
	private int salary; //  봉급
	private Date hireDate; // 고용일;
	
	public Employee() {
		super();
	}
	
	public Employee(boolean office, int salary, Date hireDate) {
		super();
		this.office = office;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public Employee(String name, String address, String tel, String email, boolean office, int salary, Date hireDate) {
		super(name, address, tel, email);
		this.office = office;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public boolean isOffice() {
		return office;
	}

	public int getSalary() {
		return salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setOffice(boolean office) {
		this.office = office;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary + ", hireDate=" + hireDate + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
