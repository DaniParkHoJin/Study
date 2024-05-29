package account;

public class Account {
	private String accountNumber;	// ���� ��ȣ
	private String name; // ������
	private int balance;	// �ܾ�
	
	// �⺻ ������
	public Account() {
		super();
	}
	// �ʵ带 ��� �޴� ������
	public Account(String accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	// ���� ��ȣ�� ��ȸ�ϴ� ������
	public String getAccountNumber() {
		return accountNumber;
	}
	// �����ָ� ��ȸ�ϴ� ������
	public String getName() {
		return name;
	}
	// �ܾ��� ��ȸ�ϴ� ������
	public int getBalance() {
		return balance;
	}
	// ���¹�ȣ ������
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	// ������ ������
	public void setName(String name) {
		this.name = name;
	}
	// �ܾ� ������
	public void setBalance(int balance) {
		this.balance = balance;
	}
		
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	// ���� ���� ��� �޼���
	public void showAccoutInfo() {
		System.out.println("���¹�ȣ: " + getAccountNumber());
		System.out.println("������: " + getName());
		System.out.println("�ܾ�:" + getBalance());
		
	}
	
	
	
	
	
	
}
