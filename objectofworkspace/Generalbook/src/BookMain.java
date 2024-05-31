
public class BookMain {

	public static void main(String[] args) {
		Magazine esquire = new Magazine();
		esquire.setAuthour("에스콰이어 편집주");
		esquire.setPage(200);
		esquire.setTitle("2024년 6월호 송강호편");
		esquire.setReleaseDate("2024년 6월 1일");
		
		System.out.println(esquire.toString());
		
		
	}

}
