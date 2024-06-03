package com.market.member;

public class Admin extends Customer {

	private String id = "Admin";
	private String password = "Admin1234";

	public Admin(String name, String phone) {
		super(name, phone);
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

}
