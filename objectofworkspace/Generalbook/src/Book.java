
public class Book {
	// 필드 선언
	private String title; // 제목
	private int page;	// 페이지 수
	private String authour;	// 저자
	
	
	// 기본 연산자
	public Book() {
		super();
	}
	// 모든 필드 연산자
	public Book(String title, int page, String authour) {
		super();
		this.title = title;
		this.page = page;
		this.authour = authour;
	}
	// 제목 접근자
	public String getTitle() {
		return title;
	}
	// 페이지 수 접근자
	public int getPage() {
		return page;
	}
	// 저자 접근자
	public String getAuthour() {
		return authour;
	}
	// 제목 설정자
	public void setTitle(String title) {
		this.title = title;
	}
	// 페이지 수 접근자
	public void setPage(int page) {
		this.page = page;
	}
	// 저자 접근자
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", page=" + page + ", authour=" + authour + "]";
	}
	
	
	
	
	
}
