package constructorReference;

public class Member {

	private String id;
	private String name;
	public Member(String id) {
		super();
		this.id = id;
		System.out.println("Member(String id)");
	}
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Member(String id, String name)");
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
}
