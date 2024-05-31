
public class Employee {
	// �ʵ�
	private String name; // �̸�
	private int employeeNumber; // ���

	// �⺻������
	public Employee() {
		super();
	}

	// �ʵ带 ��� �޴� ������
	public Employee(String name, int employeeNumber) {
		super();
		this.name = name;
		this.employeeNumber = employeeNumber;
	}

	// ������ �̸�
	public String getName() {
		return name;
	}

	// ������ ���
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	// ������ �̸�
	public void setName(String name) {
		this.name = name;
	}

	// ������ ���
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	// �޼ҵ� ���� ���
	public double computeSalary() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeNumber=" + employeeNumber + ", getName()=" + getName()
				+ ", getEmployeeNumber()=" + getEmployeeNumber() + ", computeSalary()=" + computeSalary() + "]";
	}

}
