import java.util.ArrayList;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// List �÷��� ����
		List<Student2> studentList = new ArrayList<>();
		studentList.add(new Student2("ȫ�浿", 85));
		studentList.add(new Student2("ȫ�浿", 92));
		studentList.add(new Student2("ȫ�浿", 87));
		
		// Student�� score ��Ʈ������ ��ȯ
		studentList.stream().mapToInt(s-> s.getScore())
		.forEach(score -> System.out.println(score));
		
	}

}
