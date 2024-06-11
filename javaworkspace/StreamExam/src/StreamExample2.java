import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		// List �÷��� ����
		List<Product> list = new ArrayList<>();
		for (int i = 0; i < +5; i++) {
			Product product = new Product(i, "��ǰ" + 1, "���� ȸ��", (int) (10000 * Math.random()));
			list.add(product);
		}
		
		// ��ü ��Ʈ�� ���
		Stream<Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p));

	}

}
