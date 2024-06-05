package part5;

public class Applicant<T> {
	private T kind;

	public Applicant() {
		super();
	}
	
	public Applicant(T kind) {
		super();
		this.kind = kind;
	}

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}


}
