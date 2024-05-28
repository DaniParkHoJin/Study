
public class BankAccount {
	private String name;	// ������
	private String account;	// ���¹�ȣ
	private double balance;	// �ܾ�
	private double interestRate;	// ������
	// �⺻ ������
	public BankAccount() {
		super();
	}
	// ��� �����͸� �޴� ������
	public BankAccount(String name, String account, double balance, double interestRate) {
		super();
		this.name = name;
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	// ������ ������
	public String getName() {
		return name;
	}
	// ���¹�ȣ ������
	public String getAccount() {
		return account;
	}
	// �ܾ� ������
	public double getBalance() {
		return balance;
	}
	// ������ ������
	public double getInterestRate() {
		return interestRate;
	}
	// ������ ������
	public void setName(String name) {
		this.name = name;
	}
	// ���¹�ȣ ������
	public void setAccount(String account) {
		this.account = account;
	}
	// �ܾ� ������
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// ������ ������
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
