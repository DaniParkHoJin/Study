package market;

import java.util.Scanner;

public class BookMain {
	// ��ĳ�ʰ�ü�� �Է�. ��ĳ�� ��ü�� �ΰ�, ���ڿ�, ����
	static Scanner stringInput = new Scanner(System.in);
	static Scanner numberInput = new Scanner(System.in);

	public static void main(String[] args) {
		// ���� ����
		int numberOfBook;// �����Ǽ�
		String bookID;// ����ID
		String isbn;// ����ISBN
		String bookName;// ������
		double bookPrice;// ����
		String author;// ����
		String bookExplanation;// ���� ����
		String bookcategory;// ���� �о�
		String publicationDate;// �Ⱓ��

		numberOfBook = 0; // �����Ǽ� �ʱ�ȭ 0
		// å�� ���� �޼��� ��� ����
		// ���� ���� �Է�
		// ���� ���� ����
		// ���� ���� ����
		// ���� ���� ��ȸ

		
		
		// ���� ���� �Է�
		// ����: å ������ �Է¹޴´�.
		// �Է¹��� ���� ��ü �迭�� �����ؾ� �Ѵ�.
		// ��ü �迭 ���� �� ������ �޾� ����
		
		System.out.println("-----���� ���� ����-----");
		System.out.println("--------------------");

		System.out.print("��� ���� �Ǽ� : ");
		numberOfBook = numberInput.nextInt();
		
		Book[] book = new Book[numberOfBook];
		
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
			bookcategory = stringInput.nextLine();

			System.out.print("�Ⱓ�� : ");
			publicationDate = stringInput.nextLine();

			book[i] = new Book(bookID, isbn, bookName, bookPrice, author, bookExplanation, bookcategory,
					publicationDate);
			System.out.println(book[i]);
		}

	}

}
