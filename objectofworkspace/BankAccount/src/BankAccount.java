
public class BankAccount {
	private String name;	// 예금주
	private String account;	// 계좌번호
	private double balance;	// 잔액
	private double interestRate;	// 이자율
	// 기본 생성자
	public BankAccount() {
		super();
	}
	// 모든 데이터를 받는 생성자
	public BankAccount(String name, String account, double balance, double interestRate) {
		super();
		this.name = name;
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	// 예금주 접근자
	public String getName() {
		return name;
	}
	// 계좌번호 접근자
	public String getAccount() {
		return account;
	}
	// 잔액 접근자
	public double getBalance() {
		return balance;
	}
	// 이자율 접근자
	public double getInterestRate() {
		return interestRate;
	}
	// 예금주 설정자
	public void setName(String name) {
		this.name = name;
	}
	// 계좌번호 설정자
	public void setAccount(String account) {
		this.account = account;
	}
	// 잔액 설정자
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// 이자율 설정자
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	// toString
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", account=" + account + ", balance=" + balance + ", interestRate="
				+ interestRate + "]";
	}
	
	
	
	
	
	
	
}
