
public class DiscountProduct extends Product {
	// �ʵ�
	private double discount;
	// �⺻������
	public DiscountProduct() {
		super();
	}
	// �ʵ带 ��� �޴� ������
	public DiscountProduct(String name, double price, double discount) {
		super(name, price);
		this.discount = discount;
	}
	// ������ ������
	public double getDiscount() {
		return discount;
	}
	// ������ ������
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public double getPrice() {
//		super.getPrice() * 
		return super.getPrice();
	}
	@Override
	public String toString() {
		return "���� ��ǰ [��ǰ��=" + super.getName() + ", ���ε� ����=" + super.getPrice() + "]";
	}
	
	//
	
	
	
	
}
