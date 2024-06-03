
public interface Delinquency {
	
	 // 연체 가격
	int DELAY_PAY_NOVEl = 300;// 소설 연체 가격
	int DELAY_PAY_POET = 200;// 시집 연체 가격
	int DELAY_PAY_SCIENCEFICTION = 600;// 공상과학 소설 연체 가격
	
	int getLastFees(); // 연체료를 계산하는 메소드 
}
