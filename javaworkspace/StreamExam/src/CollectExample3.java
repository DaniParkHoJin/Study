import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample3 {

	public static void main(String[] args) {
		List<Student6> totalList = new ArrayList<>();
		totalList.add(new Student6("홍길동", "남", 92));
		totalList.add(new Student6("김수영", "여", 87));
		totalList.add(new Student6("감자바", "남", 95));
		totalList.add(new Student6("오해영", "여", 93));

		Map<String, Double> map = totalList.stream()
				.collect(Collectors.groupingBy(s -> s.getSex(), Collectors.averagingDouble(s -> s.getScore())));
		System.out.println(map);
	}

}
