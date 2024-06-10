package TreeSetTreeMapExam;

import java.util.TreeSet;

public class CmparableExample {

	public static void main(String[] args) {
		//TreeSet 컬랙션 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		// 객체 저장
		Person person1 = new Person();
		person1.setName("홍길동");		
		person1.setAge(45);
		
		Person person2 = new Person();
		person2.setName("감자바");		
		person2.setAge(25);

		Person person3 = new Person();
		person3.setName("박지원");		
		person3.setAge(31);
		
		
		// 객체를 하나씩 가져오기
			System.out.println(person1.getName() + ":"+ person1.getAge());
			System.out.println(person2.getName() + ":"+ person2.getAge());
			System.out.println(person3.getName() + ":"+ person3.getAge());


	}

}
