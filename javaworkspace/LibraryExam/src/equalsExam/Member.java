package equalsExam;

public class Member {
	
	private String id;

	
	public Member() {
		super();
	}


	public Member(String id) {
		super();
		this.id = id;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {
			if (id.equals(target.id)) {
				
			}
		}
		return false;
	}
	
	



}
