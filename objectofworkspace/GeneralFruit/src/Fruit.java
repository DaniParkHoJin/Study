
public class Fruit {
	// 필드
	private double calorie; //칼로리
	private int price; // 가격
	private int weight; // 중량
	// 기본생성자
	public Fruit() {
		super();
	}
	// 모든 필드 생성자
	public Fruit(double calorie, int price, int weight) {
		super();
		this.calorie = calorie;
		this.price = price;
		this.weight = weight;
	}
	// 접근자 칼로리
	public double getCalorie() {
		return calorie;
	}
	// 접근자 가격
	public int getPrice() {
		return price;
	}
	// 접근자 중량
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return "Fruit [calorie=" + calorie + ", price=" + price + ", weight=" + weight + "]";
	}
	
	
	
	
}
