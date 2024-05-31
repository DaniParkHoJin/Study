
public class Magazine extends Book {
	// 필드
	private String releaseDate;	// 발매일
	
	// 기본생성자
	public Magazine() {
		super();
	}
	// 생성자(Book 필드 세개, Magazine 필드 하나)
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
