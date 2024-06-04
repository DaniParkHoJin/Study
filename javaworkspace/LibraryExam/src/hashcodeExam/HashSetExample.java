package hashcodeExam;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();

		Student student1 = new Student(1, "全辨悼");
		hashSet.add(student1);
		System.out.println("历厘等 按眉 荐: " + hashSet.size());

		Student student2 = new Student(1, "全辨悼");
		hashSet.add(student2);
		System.out.println("历厘等 按眉 荐: " + hashSet.size());
		
		Student student3 = new Student(2, "全辨悼");
		hashSet.add(student3);
		System.out.println("历厘等 按眉 荐: " + hashSet.size());
	}

}
