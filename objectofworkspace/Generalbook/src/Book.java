
public class Book {
	// �ʵ� ����
	private String title; // ����
	private int page;	// ������ ��
	private String authour;	// ����
	
	
	// �⺻ ������
	public Book() {
		super();
	}
	// ��� �ʵ� ������
	public Book(String title, int page, String authour) {
		super();
		this.title = title;
		this.page = page;
		this.authour = authour;
	}
	// ���� ������
	public String getTitle() {
		return title;
	}
	// ������ �� ������
	public int getPage() {
		return page;
	}
	// ���� ������
	public String getAuthour() {
		return authour;
	}
	// ���� ������
	public void setTitle(String title) {
		this.title = title;
	}
	// ������ �� ������
	public void setPage(int page) {
		this.page = page;
	}
	// ���� ������
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", page=" + page + ", authour=" + authour + "]";
	}
	
	
	
	
	
}
