
public class Book {
	int number; // 관리번호
	String title;	// 제목
	String author;	// 저자
	
	// 기본 생성자
	public Book() {
		super();
	}
	// 세 가지를 모두 받는 생성자
	public Book(int number, String title, String author) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
	}
	// 접속자 관리번호
	public int getNumber() {
		return number;
	}
	// 접속자 제목
	public String getTitle() {
		return title;
	}
	// 접속자 저자
	public String getAuthor() {
		return author;
	}
	// 설정자 관리번호
	public void setNumber(int number) {
		this.number = number;
	}
	// 설정자 제목
	public void setTitle(String title) {
		this.title = title;
	}
	// 설정자 저자
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + "]";
	}
	
	// 특별히 출력에 대한 지시가 없다. 그래도 향후 관리를 위해 toString을 생성해 논다.
	
	
	
}
