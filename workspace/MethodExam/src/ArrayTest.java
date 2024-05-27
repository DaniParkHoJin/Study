
public class ArrayTest {

	public static void main(String[] args) {
		int x = 1;
		int [] y = new int [10];
		
		arrytest(x,y);
		System.out.println("x : " + x);
		System.out.println("y[0] : " + y[0]);
	}

	public static void arrytest(int number, int[] numbers) {
		System.out.println("number : " + number);
		number = 100;
		numbers[0] = 777;
	}

}
