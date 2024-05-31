
public class HourlyEmployee extends Employee {
	// �ʵ�
	private double hourlyWage;// �ñ�
	private double workTime;// �뵿 �ð�
	// �⺻������

	public HourlyEmployee() {
		super();
	}

	// �ʵ带 ��� �޴� ������
	public HourlyEmployee(double hourlyWage, double workTime) {
		super();
		this.hourlyWage = hourlyWage;
		this.workTime = workTime;
	}

	// �θ� �ʵ� + �ڱ� �ʵ� ������
	public HourlyEmployee(String name, int employeeNumber, double hourlyWage, double workTime) {
		super(name, employeeNumber);
		this.hourlyWage = hourlyWage;
		this.workTime = workTime;
	}

	// ������ �ñ�
	public double getHourlyWage() {
		return hourlyWage;
	}

	// ������ �뵿 �ð�
	public double getWorkTime() {
		return workTime;
	}

	// ������ �ñ�
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	// ������ �ð�
	public void setWorkTime(double workTime) {
		this.workTime = workTime;
	}

	// �޼��� ������
	@Override
	public double computeSalary() {
		return this.hourlyWage * this.workTime;// �ñ� * �뵿 �ð� = �ӱ�
	}

	@Override
	public String toString() {
		return getName() + "���� �޿��� " + getHourlyWage() * getWorkTime() + "�� �Դϴ�.";
	}

}
