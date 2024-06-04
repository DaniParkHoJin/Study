package recordExam;

public class RecordExample {
	public static void main(String[] args) {
		Member member = new Member("winter", "传价捞", 25);
		System.out.println(member.id());
		System.out.println(member.name());
		System.out.println(member.age());
		System.out.println(member.toString());
		System.out.println();
		
		Member member1 = new Member("winter", "传价捞", 25);
		Member member2 = new Member("winter", "传价捞", 25);
		System.out.println("m1.hashCoed(): " + member1.hashCode());
		System.out.println("m2.hashCoed(): " + member2.hashCode());
		System.out.println("m1.equals(m2): " + member1.equals(member2));
	}
}
