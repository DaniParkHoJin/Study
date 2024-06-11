import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		List<Student6> totalList = new ArrayList<>();
		totalList.add(new Student6("ȫ�浿", "��", 92));
		totalList.add(new Student6("�����", "��", 87));
		totalList.add(new Student6("���ڹ�", "��", 95));
		totalList.add(new Student6("���ؿ�", "��", 93));
		
		// ���л��� ���� List ����
		//List<Student6> maleList = totalList.stream().filter(s-> s.getSex().equals("��")).collect(Collectors.toList());
		
		List<Student6> maleList = totalList.stream().filter(s-> s.getSex().equals("��")).toList();
		
		maleList.stream().forEach(s-> System.out.println(s.getName()));
		
		System.out.println();
		
		// �л� �̸��� Ű, �л��� ���� ������ ���� Map ����
		Map<String, Integer> map = totalList.stream().collect(Collectors.toMap(s-> s.getName(), s-> s.getScore()));
		System.out.println(map);
		
	}

}
