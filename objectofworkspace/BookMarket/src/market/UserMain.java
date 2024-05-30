package market;

public class UserMain {

	public static void main(String[] args) {
		public static void bookInput() {

			// 도서 정보 입력
			// 목적: 책 정보를 입력받는다.
			// 입력받은 값을 객체 배열로 저장해야 한다.
			// 객체 배열 선언 후 변수로 받아 저장
			System.out.println("-----도서 정보 저장-----");
			System.out.println("--------------------");

			System.out.print("등록 도서 권수 : ");
			numberOfBook = numberInput.nextInt();

			Book[] book = new Book[numberOfBook];

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
				bookcategory = stringInput.nextLine();

				System.out.print("출간일 : ");
				publicationDate = stringInput.nextLine();

				book[i] = new Book(bookID, isbn, bookName, bookPrice, author, bookExplanation, bookcategory,
						publicationDate);
				System.out.println(book[i]);
			}
	}

}
