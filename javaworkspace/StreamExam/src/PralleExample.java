import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class PralleExample {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> scores = new ArrayList<>();
		for (int i = 0; i < 1000000000; i++) {
			scores.add(random.nextInt(101));
		}
		
		double avg;
		long startTime;
		long endTime;
		long time;
		
		avg = 0.0;
		startTime = 0;
		endTime = 0;
		time = 0;
		
		Stream<Integer> stream = scores.stream();
		startTime = System.nanoTime();
		avg = stream.mapToInt(i -> i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg: " + avg + ", �Ϲ� ��Ʈ�� ó�� �ð�: " + time + "ns");
		
		Stream<Integer> paralleStream = scores.parallelStream();
		startTime = System.nanoTime();
		avg = paralleStream.mapToInt(i -> i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		
		time = endTime-startTime;
		System.out.println("avg: " + avg + ", ���� ��Ʈ�� ó�� �ð�: " + time + "ns");
		
	}

}
