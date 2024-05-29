package account;

import java.util.Scanner;

public class BankApplication {
	// 입력받기 위한 스캐너 객체
	static Scanner StringInput = new Scanner(System.in);
	static Scanner numberInput = new Scanner(System.in);

	// 필요 변수 선언
	static Account[] info; // 계좌 정보 객체 배열
	static int accountCount; // 계좌수
	static boolean isAdded; // 입력 자료 추가 확인
	static int inputLimit; // 입력 제한
	static Account inputData; // 입력 자료

	public static void main(String[] args) {
		// 필요 변수 선언
		int choice; // 메뉴 선택 변수

		// 변수 초기화
		inputLimit = 0;
		isAdded = false;

		// 계좌 수에 맞게 객체 배열 생성
		accountCount = 100;// 문제에서 100개로

		info = new Account[accountCount]; // account 객체 100개 선언

		// 학생 객체 생성
		for (int i = 0; i < info.length; i++) {
			info[i] = new Account();
		}
		do {
			showmenu();
			choice = numberInput.nextInt();
			numberInput.nextLine();// 문자열과 숫자 입력이 연속으로 되는 것을 방지

			switch (choice) {
			case 1:
				// 계좌 생성
				creatData();
				break;
			case 2:
				// 계좌 목록
				break;
			case 3:
				// 예금
				break;
			case 4:
				// 출금
				break;
			case 5:
				// 종료
				System.out.println("프로그램 종료");
				return;
			default:
				//
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}

		} while (true);

	}

	public static void creatData() {


			inputData = inputAccountInfo();

			++inputLimit;
			System.out.println("--------");
			System.out.println("계좌생성");
			System.out.println("--------");

	}

	public static Account inputAccountInfo() {
		String accountNumber; // 계좌번호
		String name; // 계좌주
		int balance; // 입금액
		Account account; // 계좌 객체 생성

		System.out.print("계좌번호: ");
		accountNumber = StringInput.nextLine();
		System.out.print("계좌주: ");
		name = StringInput.nextLine();
		System.out.print("초기입금액: ");
		balance = numberInput.nextInt();
		System.out.println("계좌가 생성되었습니다.");

		account = new Account(accountNumber, name, balance);
		if (account != null) {
			isAdded = true;
			return account;
		}
		return null;
	}

	public static void showmenu() {

		System.out.println("-------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5. 종료");
		System.out.println("-------------------------------------------");
		System.out.print("선택> ");
	}

}
