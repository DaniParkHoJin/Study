import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// ��ĳ�� ��ü ���� String, Number
		Scanner stringInput = new Scanner(System.in);
		Scanner numberInput = new Scanner(System.in);
		// ���� ����
		// �ʿ� ���� : �̸�, ���, ����, �ñ�, �뵿 �ð�
		String name;// �̸�
		int employeeNumber;// ���
		double salary; // ����
		double hourlyWage;// �ñ�
		double workTime; // �뵿 �ð�

		// �Է¹ޱ�
		System.out.println("�ӱ� ��� ���α׷�");
		System.out.println();

		// ���ް� �ñ��� �Ǻ��ʿ�, �׿� ���� ��ü �з��� �ʿ�
		System.out.print("����� �������Դϱ�? �������̸� 1, �ƴϸ� �ٸ� ��ȣ�� �����ּ���. : ");
		// �Ǻ��� ���� ���� ����

		if (numberInput.nextInt() == 1) {
			// ������ �̹Ƿ� ������ ��ü�� ����
			SalariedEmployee salariedEmployee = new SalariedEmployee();
			// �̸� �Է�
			System.out.print("�̸��� �Է��ϼ��� : ");
			name = stringInput.nextLine();
			salariedEmployee.setName(name);
			// �����ȣ �Է�, ������ ���� ���ϰ� �Ǻ��ĵ� ���� �� �ִ�.
			System.out.print("��� ��ȣ�� �Է��ϼ��� : ");
			employeeNumber = numberInput.nextInt();
			salariedEmployee.setEmployeeNumber(employeeNumber);
			// ���� �Է�, ������ ���� ���ϰ� �Ǻ��ĵ� ���� �� �ִ�.
			System.out.print("������ �Է��ϼ��� : ");
			salary = numberInput.nextDouble();
			salariedEmployee.setSalary(salary);

			System.out.println(salariedEmployee.computeSalary());

		} else {
			// ������ ��ȣ�� ��� �ñ����� ���
			HourlyEmployee hourlyEmployee = new HourlyEmployee();

			System.out.print("�̸��� �Է��ϼ��� : ");
			name = stringInput.nextLine();
			hourlyEmployee.setName(name);

			System.out.print("�ñ޸� �Է��ϼ��� : ");
			hourlyWage = numberInput.nextInt();
			hourlyEmployee.setHourlyWage(hourlyWage);

			System.out.print("���� �ð��� �Է��ϼ��� : ");
			workTime = numberInput.nextInt();
			hourlyEmployee.setWorkTime(workTime);
			
			System.out.println(hourlyEmployee.toString());
			
			
		}
		stringInput.close();
		numberInput.close();
	}

}
