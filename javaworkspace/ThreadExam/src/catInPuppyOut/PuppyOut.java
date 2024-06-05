package catInPuppyOut;

public class PuppyOut extends Thread {
private AppleBox appleBox;
private String name;

public PuppyOut(AppleBox appleBox, String name) {
	super();
	this.appleBox = appleBox;
	this.name = name;
}
public void run() {
	int value;
	value = 0;
	for (int i = 0; i < 5; i++) {
		value = appleBox.get((int)Math.random()*5 +1);
		System.out.println("-----" + this.name + ", 가지려는 수량 : " + value);
	}
	}
}
