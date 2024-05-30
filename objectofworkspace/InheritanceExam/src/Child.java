
public class Child extends Parent {

	private String jab;

	public Child() {
		super();
	}

	public Child(String name, String age, String sex) {
		super(name, age, sex);
	}

	public Child(String name, String age, String sex, String job) {
		super(name, age, sex);
		this.jab = job;

	}

	public String getJab() {
		return jab;
	}

	public void setJab(String jab) {
		this.jab = jab;
	}

	@Override
	public String toString() {
		return "Child [jab=" + jab + ", getJab()=" + getJab() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getSex()=" + getSex() + ", toString()=" + super.toString() + "]";
	}
	
	

}
