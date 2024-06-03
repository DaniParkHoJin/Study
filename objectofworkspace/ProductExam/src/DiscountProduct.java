
public class DiscountProduct extends Product {
	// 필드
	private double discount;
	// 기본생성자
	public DiscountProduct() {
		super();
	}
	// 필드를 모두 받는 생성자
	public DiscountProduct(String name, double price, double discount) {
		super(name, price);
		this.discount = discount;
	}
	// 접근자 할인율
	public double getDiscount() {
		return discount;
	}
	// 설정자 할인율
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
		return "할인 제품 [상품명=" + super.getName() + ", 할인된 가격=" + super.getPrice() + "]";
	}
	
	//
	
	
	
	
}
