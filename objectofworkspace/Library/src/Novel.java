
public class Novel extends Book implements Delinquency {
	
	int price;// �Ҽ� �⺻ �뿩 ����
	int overDay;// ��ü��


	// �⺻ ������
	public Novel() {
		super();
	}
	// �ʵ带 ��� �޴� ������
	public Novel(int price) {
		super();
		this.price = price;
	}
	// �θ�� �ڽ��� �ʵ带 ��� �޴� ������
	public Novel(int number, String title, String author, int price) {
		super(number, title, author);
		this.price = price;
	}
	// ��ü�� �������̽� �޼��� ������
	@Override
	public int getLastFees() {
		return this.price + (overDay * DELAY_PAY_NOVEl);
	}


	
	
}
