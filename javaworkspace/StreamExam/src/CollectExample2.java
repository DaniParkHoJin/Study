import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample2 {

	public static void main(String[] args) {
		List<Student6> totalList = new ArrayList<>();
		totalList.add(new Student6("ȫ�浿", "��", 92));
		totalList.add(new Student6("�����", "��", 87));
		totalList.add(new Student6("���ڹ�", "��", 95));
		totalList.add(new Student6("���ؿ�", "��", 93));

		Map<String, List<Student6>> map = totalList.stream().collect(Collectors.groupingBy(s -> s.getSex()));

		List<Student6> maleList = map.get("��");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();

		List<Student6> femaleList = map.get("��");
		femaleList.stream().forEach(s -> System.out.println(s.getName()));

	}

}
