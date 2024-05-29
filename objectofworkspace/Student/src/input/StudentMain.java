package input;

import java.util.Scanner;

public class StudentMain {
	// 메인 안에서 사용하기 위해 static 으로 스캐너 객체 생성
	static Scanner input = new Scanner(System.in);
	static Student[] info; // 학생 정보 객체 배열
	static int studentCount; // 학생 수
	static boolean isAdded; // 입력 자료 추가 확인

	public static void main(String[] args) {

		// 변수 선언
		int choice; // 메뉴 선택 번호
		Student inputData; // 입력 자료
		int inputLimit;// 입력 제한

		inputLimit = 0;
		isAdded = false; // 입력 자료 추가 확인(실패 : false)

		switch (choice) {
		case 1:
			// 입력한 학생 정보
			// 입력한 학생 정보를 추가
			break;

		case 2:
			// 학생 검색
			break;
		
		case 3:
			// 학생 삭제
			break;

		case 4:
			// 전체 목록 출력
			System.out.println("학생 전체 목록");
			break;
			
		case 5:
			// 프로그램 종료
			System.out.println("프로그램을 종료합니다.");
			return;
			
		default:
			System.out.println("잘못 입력하여 프로그램을 종료합니다.");
			break;
		}

	}

	// 메뉴
	public static void showMeun() {
		System.out.println("학생 정보 등록 프로그램");
		System.out.println("선택하세요...");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 이름으로 검색");
		System.out.println("3. 학생 이름으로 삭제");
		System.out.println("4. 전체 학생 목록");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택:");
	}

}
