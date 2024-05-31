package market;

import java.util.Scanner;

public class BookMain {
	// ��ĳ�ʰ�ü�� �Է�. ��ĳ�� ��ü�� �ΰ�, ���ڿ�, ����
	static Scanner stringInput = new Scanner(System.in);
	static Scanner numberInput = new Scanner(System.in);
	// ���� ����
	static int totalBook;// �������� å
	Book[] book = new Book[totalBook];

	public static void main(String[] args) {
		// ���� ����
		int numberOfBook;// �����Ǽ�

//		String bookID;// ����ID
//		String isbn;// ����ISBN
//		String bookName;// ������
//		double bookPrice;// ����
//		String author;// ����
//		String bookExplanation;// ���� ����
//		String bookCategory;// ���� �о�
//		String publicationDate; // �Ⱓ��

		numberOfBook = 0; // �����Ǽ� �ʱ�ȭ 0
		totalBook = 0;// ���� �Ǽ� �ʱ�ȭ 0

		// å�� ���� �޼��� ��� ����
		do {
			// ���� ���� �Է�
			bookInput();
			// ���� ���� ����
			bookModify();
			// ���� ���� ����
			bookdelet();
			// ���� ���� ��ȸ
			bookSearch();
			break;
		} while (true);

	}

	public static void bookModify() {
		Book[] book = new Book[totalBook];
		// ������ ���� ����
		int select;
		String inputKeyword; // ����ڰ� �Է��� �ܾ�
		inputKeyword = stringInput.nextLine();
		for (int i = 0; i < book.length; i++) {

			if (inputKeyword.equals(book[i].getBookName()) || inputKeyword.equals(book[i].getAuthor())
					|| inputKeyword.equals(book[i].getBookcategory())) {
				System.out.print(book[i].toString() + " �� �½��ϱ�? \n ��� �׸��� �����Ͻðڽ��ϱ�?");
				select = numberInput.nextInt();

				switch (select) {
				case 1:
					// å�̸�
					break;
				case 2:
					// ����
					break;
				case 3:
					//Ű����
					break;
				case 4:
					//�о�
					break;
				case 5:

					break;

				case 6:

					break;
				default:
					break;
				}
			} else {
				System.out.print("��ġ�ϴ� å�� �����ϴ�. �ٸ� �˻�� �Է����ּ��� : ");

			}

		}
	}

	public static void bookdelet() {

		Book[] book = new Book[totalBook];

		String inputKeyword; // ����ڰ� �Է��� �ܾ�
		inputKeyword = stringInput.nextLine();
		for (int i = 0; i < book.length; i++) {
			// ��ϵ� å��ŭ �ݺ��ϸ鼭 å�̸�, ����, Ű����, ī���� �� ��ġ�� ã�´�.
			if (inputKeyword.equals(book[i].getBookName()) || inputKeyword.equals(book[i].getAuthor())
					|| inputKeyword.equals(book[i].getBookcategory())) {
				book[i] = null;// ��ü �迭 ���� �� null�� ������ ������ �ȴ�.
				System.out.println("�����Ͻ� å�� ���� �߽��ϴ�.");
			} else {
				System.out.print("��ġ�ϴ� å�� �����ϴ�. �ٸ� �˻�� �Է����ּ��� : ");

			}

		}
	}

	public static void bookSearch() {

		Book[] book = new Book[totalBook];

		String inputKeyword; // ����ڰ� �Է��� �ܾ�
		inputKeyword = stringInput.nextLine();
		for (int i = 0; i < book.length; i++) {

			if (inputKeyword.equals(book[i].getBookName()) || inputKeyword.equals(book[i].getAuthor())
					|| inputKeyword.equals(book[i].getBookcategory())) {
				System.out.print(book[i].toString());

			} else {
				System.out.print("��ġ�ϴ� å�� �����ϴ�. �ٸ� �˻�� �Է����ּ��� : ");
			}
		}
		// �������� ��ȸ
		// ������, ����, �о��� �Է��ϸ� �˻��ؼ� ��� ������ ����� �� �ְ� �Ѵ�.

	}

	public static void bookInput() {
		// ���� ����
		int numberOfBook;// �����Ǽ�
		String bookID;// ����ID
		String isbn;// ����ISBN
		String bookName;// ������
		double bookPrice;// ����
		String author;// ����
		String bookExplanation;// ���� ����
		String bookCategory;// ���� �о�
		String publicationDate; // �Ⱓ��

		// ���� ���� �Է�
		// ����: å ������ �Է¹޴´�.
		// �Է¹��� ���� ��ü �迭�� �����ؾ� �Ѵ�.
		// ��ü �迭 ���� �� ������ �޾� ����
		System.out.println("-----���� ���� ����-----");
		System.out.println("--------------------");

		System.out.print("��� ���� �Ǽ� : ");
		numberOfBook = numberInput.nextInt();

		Book[] book = new Book[totalBook + numberOfBook];
		++totalBook;// �������� å�� �Ǽ��� ������Ų��.

		for (int i = 0; i < numberOfBook; i++) {

			System.out.print("���� ID : ");
			bookID = stringInput.nextLine();

			System.out.print("ISBN : ");
			isbn = stringInput.nextLine();

			System.out.print("������ : ");
			bookName = stringInput.nextLine();

			System.out.print("���� : ");
			bookPrice = numberInput.nextDouble();

			System.out.print("���� : ");
			author = stringInput.nextLine();

			System.out.print("���� ���� : ");
			bookExplanation = stringInput.nextLine();

			System.out.print("���� �о� : ");
			bookCategory = stringInput.nextLine();

			System.out.print("�Ⱓ�� : ");
			publicationDate = stringInput.nextLine();

			book[i] = new Book(bookID, isbn, bookName, bookPrice, author, bookExplanation, bookCategory,
					publicationDate);
			System.out.println(book[i]);
		}

	}
}