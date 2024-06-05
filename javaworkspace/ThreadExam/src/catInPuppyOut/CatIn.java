package catInPuppyOut;

public class CatIn extends Thread {
private AppleBox applebox;
private String name;

public CatIn(AppleBox applebox, String name) {
	super();
	this.applebox = applebox;
	this.name = name;
}
public void run() {
	for (int i = 0; i < 5; i++) {
		applebox.save(1);
		System.out.println("++++" + this.name + ", 담을 수량 : 1");
	}
}

}
