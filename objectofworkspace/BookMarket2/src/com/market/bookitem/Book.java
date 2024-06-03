package com.market.bookitem;

public class Book extends item {
	private String author; // 저자
	private String description; // 설명
	private String category; // 분류
	private String releaseDate; // 출판일

	public Book() {
		super();
	}

	public Book(String bookId, String isbn, String name, int unitPrice) {
		super(bookId, isbn, name, unitPrice);
	}

	public Book(String bookId, String isbn, String name, int unitPrice, String author, String description,
			String category, String realeaseDate) {
		super(bookId, isbn, name, unitPrice);
		this.author = author;
		this.description = description;
		this.category = category;
		this.releaseDate = realeaseDate;
	}

	public String getAuthor() {
		return author;
	}

	public String getDescription() {
		return description;
	}

	public String getCategory() {
		return category;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String getBookId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIsbn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getUnitPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBookId(String bookId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setIsbn(String isbn) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setUnitPrice(int unitPrice) {
		// TODO Auto-generated method stub

	}

}
