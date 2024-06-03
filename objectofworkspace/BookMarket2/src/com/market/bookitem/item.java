package com.market.bookitem;

public abstract class item {
	String bookId; // 도서 Id
	String isbn;	// ISBN
	String name;	// 도서명
	int unitPrice;	// 도서 단간
	
	// 기본생성자
	public item() {
		super();
	}
	// 네개 필드를 모두 받는 생성자
	public item(String bookId, String isbn, String name, int unitPrice) {
		super();
		this.bookId = bookId;
		this.isbn = isbn;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	public abstract String getBookId();
	public abstract String getIsbn();
	public abstract String getName();	
	public abstract int getUnitPrice();
	
	public abstract void setBookId(String bookId);
	public abstract void setIsbn(String isbn);
	public abstract void setName(String name);
	public abstract void setUnitPrice(int unitPrice);

	
	
}
