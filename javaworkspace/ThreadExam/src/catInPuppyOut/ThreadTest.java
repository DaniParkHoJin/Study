package catInPuppyOut;

public class ThreadTest {

	public static void main(String[] args) {
		AppleBox appleBox = new AppleBox();
		
		CatIn catIn = new CatIn(appleBox, "�����");
		 PuppyOut puppyOut = new PuppyOut(appleBox, "������");
		 catIn.start();
		 puppyOut.start();
	}

}
