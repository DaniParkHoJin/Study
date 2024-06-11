import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		List<Student6> totalList = new ArrayList<>();
		totalList.add(new Student6("홍길동", "남", 92));
		totalList.add(new Student6("김수영", "여", 87));
		totalList.add(new Student6("감자바", "남", 95));
		totalList.add(new Student6("오해영", "여", 93));
		
		// 남학생만 묶어 List 생성
		//List<Student6> maleList = totalList.stream().filter(s-> s.getSex().equals("남")).collect(Collectors.toList());
		
		List<Student6> maleList = totalList.stream().filter(s-> s.getSex().equals("남")).toList();
		
		maleList.stream().forEach(s-> System.out.println(s.getName()));
		
		System.out.println();
		
		// 학생 이름을 키, 학생의 점수 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream().collect(Collectors.toMap(s-> s.getName(), s-> s.getScore()));
		System.out.println(map);
		
	}

}
