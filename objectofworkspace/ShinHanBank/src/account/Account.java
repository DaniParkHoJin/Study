package account;

public class Account {
	private String accountNumber;	// 계좌 번호
	private String name; // 계좌주
	private int balance;	// 잔액
	
	// 기본 생성자
	public Account() {
		super();
	}
	// 필드를 모두 받는 생성자
	public Account(String accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	// 계좌 번호를 조회하는 접속자
	public String getAccountNumber() {
		return accountNumber;
	}
	// 계좌주를 조회하는 접속자
	public String getName() {
		return name;
	}
	// 잔액을 조회하는 접속자
	public int getBalance() {
		return balance;
	}
	// 계좌번호 설정자
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	// 계좌주 설정자
	public void setName(String name) {
		this.name = name;
	}
	// 잔액 설정자
	public void setBalance(int balance) {
		this.balance = balance;
	}
		
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	// 계좌 정보 출력 메서드
	public void showAccoutInfo() {
		System.out.println("계좌번호: " + getAccountNumber());
		System.out.println("계좌주: " + getName());
		System.out.println("잔액:" + getBalance());
		
	}
	
	
	
	
	
	
}
