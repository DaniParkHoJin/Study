
public class Melon extends Fruit {
	// 필드
	private String farm;

	// 기본생성자
	public Melon() {
		super();
	}

	// 필드 모두를 받는 생성자
	public Melon(String farm) {
		super();
		this.farm = farm;
	}

	public Melon(double calorie, int price, int weight, String farm) {
		super(calorie, price, weight);
		this.farm = farm;
	}

	@Override
	public String toString() {
		return "Melon [farm=" + farm + ", getCalorie()=" + getCalorie() + ", getPrice()=" + getPrice()
				+ ", getWeight()=" + getWeight() + "]";
	}
	
	
	
	
}
