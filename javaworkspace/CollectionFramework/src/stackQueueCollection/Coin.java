package stackQueueCollection;

public class Coin {
	private int value;

	public Coin() {
		super();
	}

	public Coin(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Coin [value=" + value + "]";
	}
	
}
