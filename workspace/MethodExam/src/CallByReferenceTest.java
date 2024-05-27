
public class CallByReferenceTest {

	public static void main(String[] args) { 
		int a[] = { 1, 2, 3, 4, 5};

		System.out.println("배열의 원래 내용 "); // 배열의 원래 내용 출력
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);

		}
		
		System.out.println();// 줄개행		
		modifyArray( a ); //a는 배열a의 시작주소를 가짐.
		
		 System.out.println("\nmodifiyArray(a)메소드 호출 후 배열 a의 내용");
		 for (int i = 0; i < a.length; i++) {
			System.out.print("  " + a[i]);
		}
		
	}

	private static void modifyArray(int b[]) { // b가 배열 a의 주소를 받음
		for (int j = 0; j < b.length; j++) {
			b[j] *= 2;
		}
	}

}
