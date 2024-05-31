
public class Magazine extends Book {
	// �ʵ�
	private String releaseDate;	// �߸���
	
	// �⺻������
	public Magazine() {
		super();
	}
	// ������(Book �ʵ� ����, Magazine �ʵ� �ϳ�)
	public Magazine(String title, int page, String authour, String releaseDate) {
		super(title, page, authour);
		this.releaseDate = releaseDate;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return "Magazine [title= "+ getTitle() +", page= " + getPage() + ", authour= " + getAuthour() + ", releaseDate= " + releaseDate + "]";
	}
	
	
	


	
}
