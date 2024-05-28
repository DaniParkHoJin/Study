import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// 1. 입력받기 위해 스캐너 객체 생성
		Scanner scanner1 = new Scanner(System.in); // String 을 받기 위한 스캐너
		Scanner scanner2 = new Scanner(System.in); // double 을 받기 위한 스캐너
		
		// 2. 객체 생성
		BankAccount expecteBalance = new BankAccount();
		
		// 3. 프로그램 이름 출력 프롬프터
		System.out.println("---신한은행 복리통장 예치 기간에 따른 예상 잔액 출력 프로그램---");
		
		// 4. 이름을 입력 받는다.
		System.out.print("예금주의 이름을 입력하세요 : ");
		expecteBalance.setName(scanner1.nextLine());
		
		// 5. 계좌번호를 입력받는다.
		System.out.print(expecteBalance.getName() + "의 계좌번호를 입력하세요 : ");
		expecteBalance.setAccount(scanner1.nextLine());		
		
		// 6. 잔액을 입력받는다.
		System.out.print(expecteBalance.getName()+ "의 계좌 " + expecteBalance.getAccount() + "에 잔액을 입력하세요 : ");
		expecteBalance.setBalance(scanner2.nextDouble());
		
		// 7. 이자율을 입력받는다.
		System.out.print(expecteBalance.getName()+ "의 계좌 " + expecteBalance.getAccount() + "에 이율을 입력하세요 : ");
		expecteBalance.setInterestRate(scanner2.nextDouble());
		
		// 8. 프로그램에 맞게 계산식을 만든다. 문제에 기본 클래스에 메서드가 없으므로 임으로 프로그램 작성을 위해 만드는 것임.
		// 복리 잔액 위해 필요한 기간을 받는다.
		int year;
		year = 
		
		
		
		//		여기서는 잔액과 기간을 입력받아 이자율에 따라 복리로 예상 잔액을 계산한다.
		
		// 9. 출력한다.
		System.out.println(expecteBalance.toString());
		
		scanner1.close();
		scanner2.close();
	}

}
