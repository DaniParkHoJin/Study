package hashcodeExam;

public class Student {
	// 필드
	private int no; // 순번
	private String name;	// 이름

	// 필드를 모두 받은 생성자
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	// 접근자 no
	public int getNo() {
		return no;
	}
	// 접근자 이름
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student target) {
			if (no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	
	

}
