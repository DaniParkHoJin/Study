package market;

import java.util.Scanner;

public class BookMain {
	// 스캐너객체로 입력. 스캐너 객체는 두개, 문자열, 숫자
	static Scanner stringInput = new Scanner(System.in);
	static Scanner numberInput = new Scanner(System.in);
	// 변수 선언
	static int totalBook;// 소장중인 책
	Book[] book = new Book[totalBook];

	public static void main(String[] args) {
		// 변수 선언
		int numberOfBook;// 도서권수

//		String bookID;// 도서ID
//		String isbn;// 도서ISBN
//		String bookName;// 도서명
//		double bookPrice;// 가격
//		String author;// 저자
//		String bookExplanation;// 도서 설명
//		String bookCategory;// 도서 분야
//		String publicationDate; // 출간일

		numberOfBook = 0; // 도서권수 초기화 0
		totalBook = 0;// 소장 권수 초기화 0

		// 책에 대한 메서드 모두 정리
		do {
			// 도서 정보 입력

			bookInput();
			// 도서 정보 수정

			// 도서 정보 삭제

			// 도서 정보 조회
			bookSearch();
			break;
		} while (true);

	}

	public static void bookSearch() {
		// 변수 선언
		String bookID;// 도서ID
		String isbn;// 도서ISBN
		String bookName;// 도서명
		double bookPrice;// 가격
		String author;// 저자
		String bookExplanation;// 도서 설명
		String bookCategory;// 도서 분야
		String publicationDate; // 출간일

		Book[] book = new Book[totalBook];

		String inputKeyword; // 사용자가 입력한 단어
		inputKeyword = stringInput.nextLine();
		for (int i = 0; i < book.length; i++) {

			if (inputKeyword.equals(book[i].getBookName()) || inputKeyword.equals(book[i].getAuthor())
					|| inputKeyword.equals(book[i].getBookcategory())) {
				book.toString();
			} else {
				System.out.print("일치하는 책이 없습니다. 다른 검색어를 입력해주세요 : ");
			}
		}
		// 도서정보 조회
		// 도서명, 저자, 분야을 입력하면 검색해서 모든 정보를 출력할 수 있게 한다.

	}

	public static void bookInput() {
		// 변수 선언
		int numberOfBook;// 도서권수
		String bookID;// 도서ID
		String isbn;// 도서ISBN
		String bookName;// 도서명
		double bookPrice;// 가격
		String author;// 저자
		String bookExplanation;// 도서 설명
		String bookCategory;// 도서 분야
		String publicationDate; // 출간일

		// 도서 정보 입력
		// 목적: 책 정보를 입력받는다.
		// 입력받은 값을 객체 배열로 저장해야 한다.
		// 객체 배열 선언 후 변수로 받아 저장
		System.out.println("-----도서 정보 저장-----");
		System.out.println("--------------------");

		System.out.print("등록 도서 권수 : ");
		numberOfBook = numberInput.nextInt();

		Book[] book = new Book[totalBook + numberOfBook];
		++totalBook;// 소장중인 책의 권수를 증가시킨다.

		for (int i = 0; i < numberOfBook; i++) {

			System.out.print("도서 ID : ");
			bookID = stringInput.nextLine();

			System.out.print("ISBN : ");
			isbn = stringInput.nextLine();

			System.out.print("도서명 : ");
			bookName = stringInput.nextLine();

			System.out.print("정가 : ");
			bookPrice = numberInput.nextDouble();

			System.out.print("저자 : ");
			author = stringInput.nextLine();

			System.out.print("도서 설명 : ");
			bookExplanation = stringInput.nextLine();

			System.out.print("도서 분야 : ");
			bookCategory = stringInput.nextLine();

			System.out.print("출간일 : ");
			publicationDate = stringInput.nextLine();

			book[i] = new Book(bookID, isbn, bookName, bookPrice, author, bookExplanation, bookCategory,
					publicationDate);
			System.out.println(book[i]);
		}

	}
}