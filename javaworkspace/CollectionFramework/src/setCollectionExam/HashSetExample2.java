package setCollectionExam;

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		// HashSet 拿泛记 积己
		Set<Member> set = new HashSet<>();

		Member member1 = new Member();
		member1.setAge(30);
		member1.setName("全辨悼");
		System.out.printf("%d\n", member1.hashCode());

		set.add(member1);

		Member member2 = new Member();
		member2.setAge(30);
		member2.setName("全辨悼");
		System.out.printf("%d\n", member2.hashCode());

		set.add(member2);
		// 历沥等 按眉 荐 免仿
		System.out.println("醚 按眉 荐 : " + set.size());
	}

}
