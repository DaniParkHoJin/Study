
public class Product {
	// 필드
	private String name; 	// 이름
	private double price;	// 가격
	// 기본 생성자
	public Product() {
		super();
	}
	// 필드를 모두 받는 생성자
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	// 접근자, 설정자
	// 접근자 이름
	public String getName() {
		return name;
	}
	// 접근자 가격
	public double getPrice() {
		return price;
	}
	// 설정자 이름
	public void setName(String name) {
		this.name = name;
	}
	// 설정자 가격
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "판매물건 [물품명 =" + name + ", 가격 =" + price + "]";
	}
	
	
	
}
