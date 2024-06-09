
public class PhoneCompanyInfo extends PhoneInfo {
	private String company;

	public PhoneCompanyInfo() {
		super();
	}

	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company: " + company);
	}

}
