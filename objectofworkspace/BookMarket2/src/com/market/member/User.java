package com.market.member;

public class User extends Customer {
	// 기본생성자
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	// 상속 받는 생성자
	public User(String name, String phone) {
		super(name, phone);
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String phone, String address) {
		super(name, phone, address);
		// TODO Auto-generated constructor stub
	}

}
