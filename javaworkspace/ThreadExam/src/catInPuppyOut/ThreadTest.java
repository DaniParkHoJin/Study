package catInPuppyOut;

public class ThreadTest {

	public static void main(String[] args) {
		AppleBox appleBox = new AppleBox();
		
		CatIn catIn = new CatIn(appleBox, "고양이");
		 PuppyOut puppyOut = new PuppyOut(appleBox, "강아지");
		 catIn.start();
		 puppyOut.start();
	}

}
