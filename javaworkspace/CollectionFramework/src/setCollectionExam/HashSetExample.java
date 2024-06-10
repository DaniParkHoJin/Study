package setCollectionExam;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// HasSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		// 객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // 중복 객체이므로 저장하지 않음
		set.add("Spring");
		set.add("Java");	// 중복 객체 이므로 저장하지 않음
		set.add("Spring");	// 중복 객체 이므로 저장하지 않음
		
		
		// 저장된 객체 수 출력
		
		int size = set.size();
		System.out.println("총 객체 수: " + size);
		
	}

}
