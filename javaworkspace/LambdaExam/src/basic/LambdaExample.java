package basic;

public class LambdaExample {

	public static void main(String[] args) {
		
		action((x,y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		});
		
		action((x,y) ->{
			int result = x -y;
			System.out.println("result: " + result);
		});
		
	}

	public static void action(Calculable Calculable) {
		// 单捞磐
		int x;
		int y;

		x = 10;
		y = 4;

		// 单捞磐 贸府
		Calculable.calculate(x, y);
	}

}
