
public class Book {
	int number; // ������ȣ
	String title;	// ����
	String author;	// ����
	
	// �⺻ ������
	public Book() {
		super();
	}
	// �� ������ ��� �޴� ������
	public Book(int number, String title, String author) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
	}
	// ������ ������ȣ
	public int getNumber() {
		return number;
	}
	// ������ ����
	public String getTitle() {
		return title;
	}
	// ������ ����
	public String getAuthor() {
		return author;
	}
	// ������ ������ȣ
	public void setNumber(int number) {
		this.number = number;
	}
	// ������ ����
	public void setTitle(String title) {
		this.title = title;
	}
	// ������ ����
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + "]";
	}
	
	// Ư���� ��¿� ���� ���ð� ����. �׷��� ���� ������ ���� toString�� ������ ���.
	
	
	
}
