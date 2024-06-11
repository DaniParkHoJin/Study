import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		// List �÷��� ����
		List<Student3> studentList = new ArrayList<>();
		studentList.add(new Student3("ȫ�浿", 30));
		studentList.add(new Student3("�ſ��", 10));
		studentList.add(new Student3("���̼�", 20));

		// ������ �������� ������������ ������ �� ��Ʈ�� ���
		studentList.stream().sorted().forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();

		// ������ �������� ������������ ������ �� ��Ʈ�� ���
		studentList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}

}
