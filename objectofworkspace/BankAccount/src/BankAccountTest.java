import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// 1. �Է¹ޱ� ���� ��ĳ�� ��ü ����
		Scanner scanner1 = new Scanner(System.in); // String �� �ޱ� ���� ��ĳ��
		Scanner scanner2 = new Scanner(System.in); // double �� �ޱ� ���� ��ĳ��
		
		// 2. ��ü ����
		BankAccount expecteBalance = new BankAccount();
		
		// 3. ���α׷� �̸� ��� ��������
		System.out.println("---�������� �������� ��ġ �Ⱓ�� ���� ���� �ܾ� ��� ���α׷�---");
		
		// 4. �̸��� �Է� �޴´�.
		System.out.print("�������� �̸��� �Է��ϼ��� : ");
		expecteBalance.setName(scanner1.nextLine());
		
		// 5. ���¹�ȣ�� �Է¹޴´�.
		System.out.print(expecteBalance.getName() + "�� ���¹�ȣ�� �Է��ϼ��� : ");
		expecteBalance.setAccount(scanner1.nextLine());		
		
		// 6. �ܾ��� �Է¹޴´�.
		System.out.print(expecteBalance.getName()+ "�� ���� " + expecteBalance.getAccount() + "�� �ܾ��� �Է��ϼ��� : ");
		expecteBalance.setBalance(scanner2.nextDouble());
		
		// 7. �������� �Է¹޴´�.
		System.out.print(expecteBalance.getName()+ "�� ���� " + expecteBalance.getAccount() + "�� ������ �Է��ϼ��� : ");
		expecteBalance.setInterestRate(scanner2.nextDouble());
		
		// 8. ���α׷��� �°� ������ �����. ������ �⺻ Ŭ������ �޼��尡 �����Ƿ� ������ ���α׷� �ۼ��� ���� ����� ����.
		// ���� �ܾ� ���� �ʿ��� �Ⱓ�� �޴´�.
		int year;
		year = 
		
		
		
		//		���⼭�� �ܾװ� �Ⱓ�� �Է¹޾� �������� ���� ������ ���� �ܾ��� ����Ѵ�.
		
		// 9. ����Ѵ�.
		System.out.println(expecteBalance.toString());
		
		scanner1.close();
		scanner2.close();
	}

}
