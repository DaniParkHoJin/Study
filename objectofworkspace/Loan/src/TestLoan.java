import java.util.Date;
import java.util.Scanner;

public class TestLoan {

	public static void main(String[] args) {

		// 입력받기 위한 스캐너 객체 생성
		Scanner input = new Scanner(System.in);
		
		System.out.print("연 이율을 입력하세요.(예 : 5.25) : ");
		double annullinterestRate = input.nextDouble();
		
		
		System.out.print("대출 기간을 년 단위로 입력하세요. : ");
		int numberOfYears = input.nextInt();
		
		System.out.println("대출 금액을 입력하세요.(예 : 1200000): ");
		double loanAmount = input.nextDouble();
		
		Loan loan = new Loan(annullinterestRate, numberOfYears, loanAmount);
		
		// 소수점 이후 두 자리를 유지하는 형식
		double monthlyPayment = (int)(loan.getMonthlyPayment()* 100) / 100.0;
		double totalPayment = (int)(loan.getTotalPayment() * 100) / 100.0;
		
		// 결과 출력
		System.out.println("대출 시작 날짜 : " + loan.getLoanDate().toString() + "\n매월 상환 금액 : " + monthlyPayment + "\n총 상환 금액 : " + totalPayment);
		
	
	}

}
