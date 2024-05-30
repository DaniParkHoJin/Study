package market;

import java.util.Scanner;

public class WelcomeMarket {

	public static void main(String[] args) {
		// 스캐너 객체 사용을 위한 스캐너 객체 생성
		Scanner numberInput = new Scanner(System.in);
		Scanner stringInput = new Scanner(System.in);

		// 변수 선언
		int menuSelection; // 메뉴선택 변수
		String userName; // 고객 이름
		String userTel; // 고객 전화번호(11자리 체크 필요)
		String userAddress; // 고객 주소

		// 객체 선언
		User[] user = new User[1];// user객체 생성을 위한 선언

		// 이름, 전화번호를 입력받고 저장.
		System.out.print("고객님의 이름을 입력해주세요 : ");
		userName = stringInput.nextLine();

		System.out.print("고객님의 휴대폰 번호(11자리)를 입력해주세요 : ");
		do {
			userTel = stringInput.nextLine();
			if (userTel.length() == 11) {
				break;
			} else {
				System.out.print("잘못 입력하셨습니다. 다시 휴대폰 번호(11자리)를 입력해주세요 : ");
			}

		} while (true);

		System.out.print("고객님의 주소를 입력해주세요 : ");
		userAddress = stringInput.nextLine();

		user[0] = new User(userName, userTel, userAddress, 0);// 객체 배열 생성 0은 일반인 1로 변경하면 관리자가 된다.

		do {// do while을 통해 반복한다. 

			menuIntroduction();

			System.out.print(userName + "고객님 메뉴(번호)를 선택해주세요 : ");
			menuSelection = numberInput.nextInt();
			System.out.println(menuSelection + "번을 선택하셨습니다.");

			if (menuSelection < 1 || menuSelection >= 8) {
				break;

			} else {
				switch (menuSelection) {
				case 1:
					// 고객정보 확인
					menuGuestInfo(userName, userTel, userAddress);
					break;
				case 2:
					// 장바구니 상품 목록 보기
					menuCartItem();
					break;
				case 3:
					menuCartClear();
					// 장바구기 비우기
					break;
				case 4:
					munuCartAdd();
					// 장바구니 항목 추가하기
					break;
				case 5:
					menuCartRemoveItemCount();
					// 장바구니의 항목 수량 줄이기
					break;
				case 6:
					menuCartRemoveItem();
					// 장바구니의 항목 삭제하기
					break;
				case 7:
					menuCarBill();
					// 영수증 표시하기
					break;
				case 8:
					// 종료
					break;
				default:
					// 이외의 번호도 종료
					break;
				}
				// break;// 넣으면 반복문 탈출
			}

		} while (true);

	}

	private static void menuIntroduction() {

		System.out.println("-------------------------------------------");
		System.out.println("KOSMO BookMarket에 오신 것을 환영합니다.");
		System.out.println("-------------------------------------------");
		System.out.println("1. 고객정보 확인 \t\t4. 장바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기 \t\t6. 장바구니의 항목 삭제하기");
		System.out.println();
		System.out.println("7. 영수증 표시하기 \n8. 종료");
		System.out.println("------------------------");
		System.out.println();

	}

	public static void menuGuestInfo(String userName, String userTel, String userAddress) {
		System.out.println("1. 고객정보 확인");
		System.out.println("고객명 : " + userName + "\n휴대폰 번호 : " + userTel + "\n주소 : " + userAddress);
	}

	public static void menuCartItem() {
		System.out.println("2. 장바구니 상품 목록");
	}

	public static void menuCartClear() {
		System.out.println("3. 장바구니 비우기");
	}

	public static void munuCartAdd() {
		System.out.println("4.장바구니에 항목 추가하기");
	}

	public static void menuCartRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기");
	}

	public static void menuCartRemoveItem() {
		System.out.println("6. 장바구니의 항목 삭제하기");
	}

	public static void menuCarBill() {
		System.out.println("7. 영수증 표시하기");
	}
}
