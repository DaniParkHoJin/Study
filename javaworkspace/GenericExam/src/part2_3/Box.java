package part2_3;

public class Box<T> {
	public T content;
	
	// Box의 내용물이 같은지 비교
	public boolean compare(Box<T> other) {
		boolean result;
		result = content.equals(other.content);
		return result;
	}
}
