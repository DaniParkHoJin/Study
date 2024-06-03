
public class Novel extends Book implements Delinquency {
	
	int price;// 소설 기본 대여 가격
	int overDay;// 연체일


	// 기본 생성자
	public Novel() {
		super();
	}
	// 필드를 모두 받는 생성자
	public Novel(int price) {
		super();
		this.price = price;
	}
	// 부모와 자신의 필드를 모두 받는 생성자
	public Novel(int number, String title, String author, int price) {
		super(number, title, author);
		this.price = price;
	}
	// 연체료 인터페이스 메서드 재정의
	@Override
	public int getLastFees() {
		return this.price + (overDay * DELAY_PAY_NOVEl);
	}


	
	
}
