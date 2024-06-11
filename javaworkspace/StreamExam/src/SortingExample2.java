import java.util.ArrayList;
import java.util.List;

public class SortingExample2 {

	public static void main(String[] args) {
		// List 컬렉션 생성

		List<Student4> studentList = new ArrayList<>();
		studentList.add(new Student4("홍길동", 30));
		studentList.add(new Student4("신용권", 10));
		studentList.add(new Student4("유미선", 20));

		// 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		studentList.stream().sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
				.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		// 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
				studentList.stream().sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
						.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
				

	}

}
