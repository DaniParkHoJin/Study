
public class Fruit {
	// �ʵ�
	private double calorie; //Į�θ�
	private int price; // ����
	private int weight; // �߷�
	// �⺻������
	public Fruit() {
		super();
	}
	// ��� �ʵ� ������
	public Fruit(double calorie, int price, int weight) {
		super();
		this.calorie = calorie;
		this.price = price;
		this.weight = weight;
	}
	// ������ Į�θ�
	public double getCalorie() {
		return calorie;
	}
	// ������ ����
	public int getPrice() {
		return price;
	}
	// ������ �߷�
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return "Fruit [calorie=" + calorie + ", price=" + price + ", weight=" + weight + "]";
	}
	
	
	
	
}
