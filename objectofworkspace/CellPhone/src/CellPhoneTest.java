import java.util.Scanner;

public class CellPhoneTest {

	public static void main(String[] args) {

//		1. �Է¹ޱ� ���� ��ĳ�� ��ü ����
//		2. cellphone ��ü ����
//		3. ���α׷� �̸� ���
//		4. �𵨸� �Է¹޴´�.
//		5. ����ȸ�縦 �Է¹޴´�.
//		6. ������ �Է¹޴´�.
//		7. ���� ���¸� �Է¹޴´�.
//		8. ī�޶� �������θ� �Է¹޴´�.
//		9. �Էµ� ī�޶� ������ ����Ѵ�.
//		
		// 1. �Է¹ޱ� ���� ��ĳ�� ��ü ����
		Scanner scanner1 = new Scanner(System.in);// String �� �Է¹ޱ� ���� Scanner ��ü
		Scanner scanner2 = new Scanner(System.in);// int �� �Է¹ޱ� ���� Scanner ��ü
		// 2. cellPhone ��ü ����
		CellPhone workPlacePhone = new CellPhone();
//		3. ���α׷� �̸� ���
		System.out.println("---------------������ �۾��� �ڵ��� ���� Ȯ�� ���α׷�---------------");
		System.out.println();
//		4. �𵨸� �Է¹޴´�.
		System.out.print("�ڵ����� �𵨸��� �Է��ϼ��� : ");
		workPlacePhone.setModelName(scanner1.nextLine());

//		5. ����ȸ�縦 �Է¹޴´�.
		System.out.print(workPlacePhone.getModelName() + " �� ����ȸ�縦 �Է��ϼ��� : ");
		workPlacePhone.setCompany(scanner1.nextLine());

//		6. ������ �Է¹޴´�.
		System.out.print(workPlacePhone.getModelName() + " �� ������ �Է��ϼ��� : ");
		workPlacePhone.setColor(scanner1.nextLine());

//		7. ���� ���¸� Ȯ���Ѵ�. ���� �Ǻ��� ���� �ʿ� ����.
		System.out.print(workPlacePhone.getModelName() + " �� ���������� 0, ���������� 1�� �Է��ϼ��� : ");
		int onOff; // �������¸� �Է¹ޱ� ���� ����
		onOff = scanner2.nextInt();
		if (onOff == 0) {
			workPlacePhone.setPower(false);;
		} else {
			workPlacePhone.setPower(true);
		}
//		8. ī�޶� �������θ� �Է¹޴´�. ���� �Ǻ��� ���� �ʿ� ����.
		System.out.print(workPlacePhone.getModelName() + " �� ī�޶� ������ 0, ������ 1�� �Է��ϼ��� : ");
		int existence;// ���� ���θ� �Է¹ޱ� ���� ����
		existence = scanner2.nextInt();
		if (existence == 0) {
			workPlacePhone.setCamera(false);
		} else {
			workPlacePhone.setCamera(true);
			
		}
//		9. �Էµ� ���� ������ ����Ѵ�.
		System.out.print("������ �۾����� " + workPlacePhone.getCompany() +" "+ workPlacePhone.getModelName() + " �� ������ " + workPlacePhone.getColor() +"�̰� ī�޶� " );
		if (workPlacePhone.isCamera() == true) {
			System.out.print("������ ���� ");
		} else {
			System.out.print("������ ���� ");
		}
		if (workPlacePhone.isPower() == true) {
			workPlacePhone.turnOn();
		} else {
			workPlacePhone.turnOff();
		}
		
		System.out.println(workPlacePhone.toString());

		
		scanner1.close();
		scanner2.close();
	}

}
