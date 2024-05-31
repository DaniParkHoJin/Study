
public class SalariedEmployee extends Employee {
	// �ʵ�
	private double salary;// ����

	// �⺻ ������
	public SalariedEmployee() {
		super();
	}
	// �ڽ� �ʵ� ������
	public SalariedEmployee(double salary) {
		super();
		this.salary = salary;
	}

	// �ڽ� �ʵ�� Employee �ʵ� ������
	public SalariedEmployee(String name, int employeeNumber, double salary) {
		super(name, employeeNumber);
		this.salary = salary;
	}

	// ������ ����
	public double getSalary() {
		return salary;
	}

	// ������ ����
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// �ż��� ������
	@Override
	public double computeSalary() {
		return this.salary;
	}
	@Override
	public String toString() {
		return "������" + getName()+"���� �����ȣ�� " + getEmployeeNumber() + "�̸�, ������ " + computeSalary()+ "�� �Դϴ�.";
	}



}
