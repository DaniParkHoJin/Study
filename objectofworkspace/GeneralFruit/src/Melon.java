
public class Melon extends Fruit {
	// �ʵ�
	private String farm;

	// �⺻������
	public Melon() {
		super();
	}

	// �ʵ� ��θ� �޴� ������
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
