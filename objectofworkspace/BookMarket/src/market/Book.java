package market;

public class Book {
	private String bookID;// ����ID
	private String isbn;// ����ISBN
	private String bookName;// ������
	private double bookPrice;// ����
	private String author;// ����
	private String bookExplanation;// ���� ����
	private String bookcategory;// ���� �о�
	private String PublicationDate;// �Ⱓ��
	
	public Book() {
		super();
	}

	public Book(String bookID, String isbn, String bookName, double bookPrice, String author, String bookExplanation,
			String bookcategory, String publicationDate) {
		super();
		this.bookID = bookID;
		this.isbn = isbn;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.author = author;
		this.bookExplanation = bookExplanation;
		this.bookcategory = bookcategory;
		PublicationDate = publicationDate;
	}

	public String getBookID() {
		return bookID;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public String getAuthor() {
		return author;
	}

	public String getBookExplanation() {
		return bookExplanation;
	}

	public String getBookcategory() {
		return bookcategory;
	}

	public String getPublicationDate() {
		return PublicationDate;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setBookExplanation(String bookExplanation) {
		this.bookExplanation = bookExplanation;
	}

	public void setBookcategory(String bookcategory) {
		this.bookcategory = bookcategory;
	}

	public void setPublicationDate(String publicationDate) {
		PublicationDate = publicationDate;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", isbn=" + isbn + ", bookname=" + bookName + ", bookPrice=" + bookPrice + ", author="
				+ author + ", bookExplanation=" + bookExplanation + ", bookcategory=" + bookcategory
				+ ", PublicationDate=" + PublicationDate + "]";
	}
	
	
}