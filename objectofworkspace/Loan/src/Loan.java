import java.util.Date;

public class Loan {
	private double annuallnterestRate; // 연이율(기본값 2.5)
	private int numberOfYears; // 대출 기간(기본값 1)
	private double loanAmount; // 대출 금액(기본값 : 1000)
	private java.util.Date loanDate; // 대출 일자

	// 기본생성자
	public Loan() {
		super(); // 기본생성자 권장 방법

	}

	// 주어진 이율, 기간, 금액의 생성자
	public Loan(double annuallnterestRate, int numberOfYears, double loanAmount) {
		super();
		this.annuallnterestRate = annuallnterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;

	}

	// 연이율 반환
	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}

	// 연이율 변경
	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
	}

	// 대출 기간 반환
	public int getNumberOfYears() {
		return numberOfYears;
	}

	// 대출 기간 변경
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	// 대출 금액 반환
	public double getLoanAmount() {
		return loanAmount;
	}

	// 대출 금액 변경
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	// 월 상환액 반환
	public double getMonthlyPayment() {
		double monthlyinterestRate = annuallnterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyinterestRate
				/ (1 - (Math.pow(1 / (1 + monthlyinterestRate), numberOfYears * 12)));
		return monthlyPayment;
	}

	// 총 상환액 반환
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	// 대출일 반환
	public java.util.Date getLoanDate() {
		return loanDate;
	}

}
