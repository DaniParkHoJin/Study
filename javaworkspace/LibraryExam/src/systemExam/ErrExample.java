package systemExam;

public class ErrExample {

	public static void main(String[] args) {

		try {
			int value = Integer.parseInt("1oo");
		} catch (NumberFormatException e) {
			System.err.println("[��������]");
			System.err.println(e.getMessage());
		}
	}

}
