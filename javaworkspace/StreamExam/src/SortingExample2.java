import java.util.ArrayList;
import java.util.List;

public class SortingExample2 {

	public static void main(String[] args) {
		// List �÷��� ����

		List<Student4> studentList = new ArrayList<>();
		studentList.add(new Student4("ȫ�浿", 30));
		studentList.add(new Student4("�ſ��", 10));
		studentList.add(new Student4("���̼�", 20));

		// ������ �������� ������������ ������ �� ��Ʈ�� ���
		studentList.stream().sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
				.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		// ������ �������� ������������ ������ �� ��Ʈ�� ���
				studentList.stream().sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
						.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
				

	}

}
