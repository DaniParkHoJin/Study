package part2_3;

public class Box<T> {
	public T content;
	
	// Box�� ���빰�� ������ ��
	public boolean compare(Box<T> other) {
		boolean result;
		result = content.equals(other.content);
		return result;
	}
}
