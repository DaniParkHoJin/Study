package part2_3;

public class GenricExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "100";
		
		Box<String> box2 = new Box();
		box2.content = "100";
		
		boolean result;
		result = box1.equals(box2);
		System.out.println("°á°ú : " + result);
	}

}
