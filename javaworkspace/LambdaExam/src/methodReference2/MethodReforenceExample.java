package methodReference2;

public class MethodReforenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(String :: compareToIgnoreCase);

	}

}
