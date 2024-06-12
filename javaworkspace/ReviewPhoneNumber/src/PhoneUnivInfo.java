
public class PhoneUnivInfo extends PhoneInfo {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7083802188596506806L;
	private String major;
	private int year;

	public PhoneUnivInfo() {
		super();
	}

	public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("major: " + major);
		System.out.println("year: " + year);
	}

}
