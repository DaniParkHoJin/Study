import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		List<Student5> studentList = Arrays.asList(

				new Student5("홍길동", 92), new Student5("신용권", 95), new Student5("감자바", 88));
		
		// 방법1
		int sum1 = studentList.stream().mapToInt(Student5 :: getScore).sum();
		
		// 방법2
		int sum2 = studentList.stream().map(Student5 :: getScore).reduce(0, (a,b) -> a+b);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
	}

}
