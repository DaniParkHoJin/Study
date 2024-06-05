package part1;

public class GenericExample {

	public static void main(String[] args) {
		//Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "æ»≥Á«œººø‰.";
		String str;
		str = box1.content;
		System.out.println(str);
		
		//Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 123;
		int value;
		value = box2.content;
		System.out.println(value);
		
	}

}
