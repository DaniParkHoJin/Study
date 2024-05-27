
public class ArgsTest {

	public static void main(String[] args) {
		varArg("Hello", "Wordl", 10);
		System.out.println();
		varArg2(1,2,3,4,5);
		
	}

	private static void varArg2(Object ...args) {
		for (Object x : args) {
			System.out.println(x);
		}
	}

	public static void varArg(Object ... args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
