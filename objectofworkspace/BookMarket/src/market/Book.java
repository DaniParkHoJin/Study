package market;

public class Book {
	private String bookID;// 도서ID
	private String isbn;// 도서ISBN
	private String bookName;// 도서명
	private double bookPrice;// 가격
	private String author;// 저자
	private String bookExplanation;// 도서 설명
	private String bookcategory;// 도서 분야
	private String PublicationDate;// 출간일
	
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
