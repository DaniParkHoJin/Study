package methodReference2;

public class Person {

	public void ordering(Comparable comparable) {
		String a;
		String b;
		
		a= "홍길동";
		b = "김길동";
		
		int result = comparable.Compare(a, b);
		
		if (result < 0) {
			System.out.println(a + "은 " + b + "보다 앞에 옵니다.");
		}else if (result == 0 ) {
			System.out.println(a + "은 " + b + "과 같습니다.");
		} else {
			System.out.println(a + "은 " + b + "보다 뒤에 옵니다.");

		}
	}
}
